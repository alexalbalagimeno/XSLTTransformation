<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:strip-space elements="*" />

  <xsl:template match="/">
      <premis>
          <xsl:for-each select="//premi">
          <xsl:element name="{@categoria}">
             <premi>
                <xsl:attribute name="any"><xsl:value-of select="any"/></xsl:attribute>
                <xsl:attribute name="premiat"><xsl:value-of select="premiat"/></xsl:attribute>
                <categoria><xsl:value-of select="@categoria"/></categoria>
                <motiu><xsl:value-of select="motiu"/></motiu>
             </premi>
          </xsl:element>
          </xsl:for-each>
      </premis>
  </xsl:template>

  
</xsl:stylesheet>

