<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:template match="/Students">
		<html>
			<body>
				<h1 align='center' style="color:crimson">Students Data</h1>
				<table border="1" align="center" bgcolor="lavender">
					<tr>
						<th bgcolor="lightpink">Number</th>
						<th bgcolor="lightgreen">Name</th>
						<th bgcolor="skyblue">Email</th>
						<th bgcolor="yellow">Marks</th>
						<th bgcolor="plum">Class</th>
					</tr>
					<xsl:for-each select="student">
						<tr>
							<td bgcolor="lightyellow">
								<xsl:value-of select="no" />
							</td>
							<td bgcolor="lightyellow">
								<xsl:value-of select="name" />
							</td>
							<td bgcolor="lightyellow">
								<xsl:value-of select="email" />
							</td>
							<td bgcolor="lightyellow">
								<xsl:value-of select="marks" />
							</td>
							<td bgcolor="lightyellow">
								<xsl:value-of select="classs" />
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>