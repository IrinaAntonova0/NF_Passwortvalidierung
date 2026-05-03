# [NF_Passwortvalidierung](https://github.com/IrinaAntonova0/NF_Passwortvalidierung)

## Projektbeschreibung

Es handelt sich um einen Passwort Checker der im Terminal zur Passworteingabe auffordert und auf Erfüllung aller Policies achtet.
Solange die Policies nicht erfüllt sind, muss der User weitere Passwörter eingeben.

### Policies

Das Passwort muss:

1. mindestens **8 Zeichen** haben
2. mindestens **eine Ziffer (0–9)** enthalten
3. **Groß- und Kleinbuchstaben (a-z)(A-Z)** enthalten
4. nicht in einer Liste häufiger/schwacher Passwörter vorkommen, Liste= **{"password", "Passwort1", "12345678", "Aa345678"}**

5. (BONUS is implemented) mindestens ein Sonderzeichen enthalten, Liste= **"!@#$%^&*()-_+=?.,;:"**
6. ~~(BONUS not implemented) Mindestanzahl unterschiedlicher Zeichengruppen (z. B. 3 von 4: Groß, Klein, Ziffer, Sonderzeichen)~~

## Build, Run & Tests

### Lokal

```bash
mvn clean verify       # kompilieren + alle Tests ausführen
mvn package            # JAR bauen → target/*.jar
java -jar target/*.jar # JAR starten
``` 

### CI

[![Java CI with Maven](https://github.com/IrinaAntonova0/NF_Passwortvalidierung/actions/workflows/maven.yml/badge.svg)](https://github.com/IrinaAntonova0/NF_Passwortvalidierung/actions/workflows/maven.yml)
