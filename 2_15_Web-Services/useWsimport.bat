PATH= %PATH%;C:\Program Files\Java\jdk1.8.0\bin
wsimport -s src -p com.tutego.insel.ws.gen.geoipservice http://www.webservicex.net/geoipservice.asmx?WSDL
REM wsimport -d src -keep -p com.tutego.insel.ws.gen.chrisws http://localhost:8080/services?wsdl