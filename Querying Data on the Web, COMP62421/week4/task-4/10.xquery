(:Q10:)
for $c in doc('country_e.xml')//country/country-tuple
return concat($c/name/data(),' ',count( doc('geo_island_e.xml')//geo_island/geo_island-tuple[country = $c/code]))
