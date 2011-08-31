
OUTPUT_DIRECTORY=../src/org/lastrix/asn1s/schema/parser/
all: ASN1SchemaCompiler.java
	rm ${OUTPUT_DIRECTORY}ASN1SchemaCompiler.jj

ASN1SchemaCompiler.java: ${OUTPUT_DIRECTORY}ASN1SchemaCompiler.jj
	cd ${OUTPUT_DIRECTORY} && javacc ASN1SchemaCompiler.jj

${OUTPUT_DIRECTORY}ASN1SchemaCompiler.jj: ASN1SchemaCompiler.jjt
	jjtree -OUTPUT_DIRECTORY=${OUTPUT_DIRECTORY} ASN1SchemaCompiler.jjt

