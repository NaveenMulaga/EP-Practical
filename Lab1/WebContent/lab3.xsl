<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:template match="/books">
	<html>
 <body>
 <table border="1" align="center" bgcolor="lavender">
 <tr>
 <th bgcolor="yellow">Title</th>
 <th bgcolor="yellow">Author</th>
 <th bgcolor="yellow">Publisher</th>
 <th bgcolor="yellow">Edition</th>
 <th bgcolor="yellow">Price</th>
 </tr>
 <xsl:for-each select="book">
 <tr>
 <td bgcolor="lightyellow"><xsl:value-of select="title"/></td>
 <td bgcolor="lightyellow"><xsl:value-of select="author"/></td>
 <td bgcolor="lightyellow"><xsl:value-of select="publisher"/></td>
 <td bgcolor="lightyellow"><xsl:value-of select="edition"/></td>
 <td bgcolor="lightyellow"><xsl:value-of select="price"/></td>
 </tr>
 </xsl:for-each>
 </table>
 </body>
 </html>	
	</xsl:template>
</xsl:stylesheet>