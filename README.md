#NF_Passwortvalidierung

##Projektbeschreibung:

Es handelt sich um einen Passwort Checker der per Kommandozeile ein eingegebenes Passwort einliest, und auf Erfüllung aller Policies achtet.

##Policies

Das Passwort muss

1. mindestens 8 Zeichen haben, Mindestanzahl muss > 0 sein
2. mindestens eine Ziffer (0–9) enthalten
3. Groß- und Kleinbuchstaben (beides muss vorkommen) enthalten
4. nicht in einer Liste häufiger/schwacher Passwörter vorkommen

5. (BONUS not implemented) mindestens ein Sonderzeichen (definiere erlaubte Menge)
6. (BONUS not implemented) Mindestanzahl unterschiedlicher Zeichengruppen (z. B. 3 von 4: Groß, Klein, Ziffer, Sonderzeichen)]

--------------------------------------------------------
[click text](https://expurl.com)

- To create a wallet file, run the command:
```aidl
web3j wallet create
```
--------------------------------------------------------
--------------------------------------------------------
README-Checkliste (erforderlich)

    Projektbeschreibung + Policy (klar und knapp).

    Build/Run/Tests:
        lokal: mvn clean verify
        Artefakt: mvn package → target/*.jar
    CI-Status-Badge (Actions).
    Beispiel-Aufrufe (optional: CLI).
    Hinweis auf Bonusumfang (falls umgesetzt).
--------------------------------------------------------
--------------------------------------------------------