package com.toohightoplay.vu.mif.ot2.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author TooHighToPlay
 * 
 */
public class SpecToProductDomParser {

	private static final String SPEC_TO_PRODUCT_ELEMENT = "map";

	private static final String SPECIFICATION_CLASS_ELEMENT = "specificationClass";

	private static final String SPECIFICATION_PROPERTIES_ELEMENT = "specificationProperties";

	private static final String PRODUCT_CLASS_ELEMENT = "productClass";

	private static final String PRODUCT_PROPERTIES_ELEMENT = "productProperties";

	private SpecToProductDomParser() {

	}

	/**
	 * Parses XML file in format:
	 * 
	 * <mapper> <map> <specificationClass></specificationClass>
	 * <specificationCreationString></specificationCreationString>
	 * <productClass></productClass>
	 * <productCreationString></productCreationString> </map> </mapper>
	 * 
	 * @throws IOException
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 */
	public static List<SpecToProductType> parseXmlFile(String filename)
			throws SAXException, IOException, ParserConfigurationException {

		List<SpecToProductType> mapperList = new ArrayList<>();

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(ClassLoader
				.getSystemResourceAsStream("productMapper.xml"));

		NodeList specToMapNodeList = document
				.getElementsByTagName(SPEC_TO_PRODUCT_ELEMENT);

		for (int i = 0; i < specToMapNodeList.getLength(); i++) {

			Node map = specToMapNodeList.item(i);

			if (map.hasChildNodes()) {
				NodeList tempNode = map.getChildNodes();

				// specification and product START
				String specificationClassName = null;
				String specificationCreationString = null;
				String productClassName = null;
				String productCreationString = null;
				// specification and product END

				for (int j = 0; j < tempNode.getLength(); j++) {

					if (tempNode.item(j).getNodeType() != Node.ELEMENT_NODE) {
						continue;
					}
					Element element = (Element) tempNode.item(j);

					if (element.getNodeName().equalsIgnoreCase(
							SPECIFICATION_CLASS_ELEMENT)) {
						specificationClassName = element.getTextContent()
								.trim();

					} else if (element.getNodeName().equalsIgnoreCase(
							SPECIFICATION_PROPERTIES_ELEMENT)) {
						specificationCreationString = element.getTextContent()
								.trim();
					} else if (element.getNodeName().equalsIgnoreCase(
							PRODUCT_CLASS_ELEMENT)) {
						productClassName = element.getTextContent().trim();
					} else if (element.getNodeName().equalsIgnoreCase(
							PRODUCT_PROPERTIES_ELEMENT)) {
						productCreationString = element.getTextContent().trim();
					}
				}

				mapperList.add(new SpecToProductType(specificationClassName,
						specificationCreationString, productClassName,
						productCreationString));
			}
		}
		return mapperList;
	}
}
