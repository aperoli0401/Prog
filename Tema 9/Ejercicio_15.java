

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class Ejercicio_15 {
    public static void main(String[] args) {
        try {
            // 1. Creamos la factoría para poder crear el constructor de documentos
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Creamos el DocumentBuilder que procesará el XML
            DocumentBuilder builder = factory.newDocumentBuilder();
           
            // 2. Cargamos y parseamos el archivo config.xml en un objeto Document (árbol DOM)
            Document documento = builder.parse(new File("config.xml"));

            // Opcional pero recomendado: Normaliza el árbol XML para eliminar nodos vacíos redundantes
            documento.getDocumentElement().normalize();

            // 3. Obtener el elemento raíz (<configuracion>)
            Element raiz = documento.getDocumentElement();
            System.out.println("Elemento raíz: " + raiz.getNodeName());
           
            // 4. Obtener los hijos de <base-datos> mediante su etiqueta
            NodeList listaBaseDatos = documento.getElementsByTagName("base-datos");
            // Tomamos el primer (y único en este caso) nodo de la lista
            Node nodoBaseDatos = listaBaseDatos.item(0);
            
            // 5. Obtenemos todos los nodos hijos de <base-datos>
            NodeList hijos = nodoBaseDatos.getChildNodes();
            
            // Reflexión: Detectará 7 hijos. Esto es porque cuenta las etiquetas Y los saltos de línea/espacios (nodos de texto).
            System.out.println("\nNúmero de hijos detectados: " + hijos.getLength());
            
            System.out.println("--- Listando hijos ---");
            
            // Recorremos todos los nodos hijos
            for (int i = 0; i < hijos.getLength(); i++) {
                // Obtenemos el nodo actual de la iteración
                Node hijo = hijos.item(i);
                
                // 6. Filtramos para trabajar solo con nodos que sean elementos reales (etiquetas)
                // Node.ELEMENT_NODE identifica etiquetas como <host>, <puerto>, etc.
                if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("Elemento real: " + hijo.getNodeName() + " -> Valor: " + hijo.getTextContent());
                } else {
                    // Esto muestra los nodos de texto (saltos de línea) que DOM detecta automáticamente
                    System.out.println("Hijo índice " + i + " es un nodo de tipo: " + hijo.getNodeType() + " (Espacio/Salto)");
                }
            }
        } catch (Exception e) {
            // Capturamos cualquier error (archivo no encontrado, etc.)
            e.printStackTrace();
        }
    }
}
 