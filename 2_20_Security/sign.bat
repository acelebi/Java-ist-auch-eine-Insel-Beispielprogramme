REM ******** Schl�sselspeicher erzeugen und Schl�ssel einsetzen

rem keytool -keystore ullis.keystore -genkey -alias CUllenbooom -dname "C=de,L=Paderborn,CN=Christian Ullenboom,O=Java-Tutor" -keypass ulliulli -storepass ulliulli

REM ******** Schl�ssel melden

rem keytool -keystore ullis.keystore -storepass ulliulli -alias CUllenbooom -list -v

REM ******** X.509-Zertifikat erzeugen

keytool -keystore ullis.keystore -storepass ulliulli -alias CUllenbooom -export -file Ullis.cer
