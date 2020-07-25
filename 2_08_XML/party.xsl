<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!-- Match auf das Root-Element des XPath-Baums -->
<!-- Ausgabe von HTML-Kopf und -Fuss -->
   <xsl:template match="/">
      <html>
         <head>
            <title>Wir machen eine Party</title>
         </head>

         <body>
<!-- An dieser Stelle wird tiefer in den XPath Baum -->
<!-- verzweigt. Die Ausgabe der anderen Templates   -->
<!-- wird an dieser Stelle eingefuegt               -->
            <xsl:apply-templates />
         </body>
      </html>
   </xsl:template>

<!-- Fuer das Element party der XML Datei wird eine Ueberschrift -->
<!-- fuer die Ausgabe erzeugt. Das Attribut Datum wird in der   -->
<!-- Ueberschrift ausgegeben. -->
   <xsl:template match="party">
      <h1>Partytabelle fuer den 
      <xsl:value-of select="@datum" />
      </h1>

      <xsl:apply-templates />
   </xsl:template>

<!-- Fuer jeden einzelnen Gast wird eine Begruessung ausgegeben -->
   <xsl:template match="gast">
      <p>
         <h2>Hallo 
         <xsl:value-of select="@name" />
         </h2>
      </p>

      <xsl:apply-templates />
   </xsl:template>

<!-- Jedem Gast wird sein Lieblingsgetraenkt angeboten. -->
   <xsl:template match="getraenk">
      <p>Hier ist ein 
      <xsl:value-of select="." />

      fuer dich.</p>
   </xsl:template>

<!-- Hier wird eine bedingte Ausgabe erzeugt. Jeder Gast -->
<!-- zeigt seinen Zustand und sagt ob er noch ledig ist. -->
   <xsl:template match="zustand">
      <xsl:if test="@nuechtern='true'">
         <h3>Ich bin noch nuechtern!</h3>
      </xsl:if>

      <xsl:if test="@ledig='true'">
         <h3>Ich bin noch zu haben!</h3>
      </xsl:if>

      <hr />
   </xsl:template>
</xsl:stylesheet>
