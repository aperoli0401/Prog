import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Ejercicio_16 {
    public static void main(String[] args) {
        try {
            // === FASE 1: Inicializar el documento vacío ===
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Creamos un documento nuevo y vacío en memoria
            Document documento = builder.newDocument();

            // === FASE 2: Construir el árbol de Nodos/Elementos ===
            
            // 1. Crear el elemento raíz <videojuego>
            Element raiz = documento.createElement("videojuego");
            // 2. Añadirlo al documento principal
            documento.appendChild(raiz);

            // 3. Crear el elemento <pantalla>
            Element pantalla = documento.createElement("pantalla");
            // 4. Asignarle el atributo "resolucion"
            pantalla.setAttribute("resolucion", "1920x1080");
            // 5. Asignarle el texto interno "true"
            pantalla.setTextContent("true");
            // 6. Añadirlo a la raíz
            raiz.appendChild(pantalla);

            // 7. Crear el elemento <audio>, asignarle atributo y texto interno
            Element audio = documento.createElement("audio");
            audio.setAttribute("volumen", "80");
            audio.setTextContent("false");
            
            // 8. Añadirlo al árbol (hijo de la raíz)
            raiz.appendChild(audio);

            // === FASE 3: El "Transformer" (Exportar memoria a archivo físico) ===
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            
            // Truco: Activar la indentación para que el XML no salga en una sola línea
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            // 9. Definir el origen (nuestro árbol DOM en memoria)
            DOMSource origen = new DOMSource(documento);
            // 10. Definir el destino (el archivo de texto que se creará)
            StreamResult destino = new StreamResult(new File("juego_config.xml"));

            // 11. Ejecutar la transformación para generar el archivo
            transformer.transform(origen, destino);

            System.out.println("¡Archivo XML generado con éxito de manera estructurada!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
