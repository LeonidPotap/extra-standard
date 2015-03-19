# Automatisierter Test eines eXTra Client Fachverfahrens #

Die automatisierte Testdurchführung von Unit- und Integrationstests einzelner Module erfolgt mit JUnit in einer Jenkins-Umgebung.
Zusätzlich zu den Unit- und Integrationstests sollen auch die entwickelten Fachverfahren automatisiert getestet werden. Dies erfolgt in folgenden Schritten:

## Voraussetzungen ##

Um reproduzierbar-Testbare Ergebnisse erhalten zu können, muß bei Testbeginn folgendes sichergestellt werden:
  * Als Datenbank für die automatisierten Tests wird HSQLDB eingesetzt.
  * Die Datenbank wird komplett neu aufgebaut mit Stammdaten
    * Die DB-Migrationsskripte sollen mit flyway programmatisch aufgerufen werden.
  * Die Log-Verzeichnisse werden vollständig gelöscht

## Fachverfahren (Phasen) durchführen ##

In jeder Phase können folgende Dinge geprüft werden:

  * Input-Dateien
  * Output-Dateien
  * Datenbank-Output
  * Logdateien
  * eXTra-XML-Nachrichten (Client und Server)

Beispiel Fachverfahren Sterbedaten:

| | Phase 1 | Phase 2 | Phase 3 |
|:|:--------|:--------|:--------|
| Input-Dateien | X | - | - |
| Output-Dateien | - | X | - |
| Datenbank-Output | X | X | X |
| Logdateien | X | X | X |
| eXTra-XML-Nachrichten| X | X | X |


Die automatisierten Tests werden schrittweise entwickelt.
Im ersten Schritt soll der Datenbank-Output getestet werden:
  * Nach dem Aufruf einer Phase werden über JPA Abfragen auf den zentralen Objekten (Execution, ...) durchgeführt.
  * Es wird z.B. getestet, das sich nach Phase 1 drei Einträge in der Tabelle Execution befinden