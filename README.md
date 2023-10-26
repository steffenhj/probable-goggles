# probable-goggles
oblig 3 software engineering

Jeg laget et tomt github repository, slik at jeg kunne commit og pushe eksisterene lokalt prosjekt til github. 

Endret pom.xml filen slik at jeg hadde riktige versioner og maven-surefire-plugin. 

Lagde run-tests.yaml filen for å skrive workflow slik at testene kjøres når de blir pushet til github. 
I .yaml filen spesifiserer jeg at det skal kjøres på ubuntu-latest. Og med java version 17. Til slutt bruker jeg commandoen run: slik at testene blir kjørt på github. 
