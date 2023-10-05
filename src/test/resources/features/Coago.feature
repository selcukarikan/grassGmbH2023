
Feature: Anmeldung und Arbeitsvorrat

Scenario: TC1000 Erfolgreiche Anmeldung und Anzeige von Fertigungsaufträgen
Given Ein Werker meldet sich an einer Maschine mit COAGO an
When er seine gültigen Credentials eingibt
Then wird der Dialog "Arbeitsvorrat" angezeigt

When er auf die Option "1-Anzeige" klickt
Then wird der Dialog "Fertigungsauftrag anzeigen" für den ausgewählten Fertigungsauftrag angezeigt
And werden alle zugeordneten Arbeitsgänge und deren aktueller Bearbeitungsstatus angezeigt

When er auf die Schaltfläche F3 Ende klickt
Then wird er auf den Dialog "Arbeitsvorrat" zurückgebracht

Scenario: TC2000 Falsche Credentials oder unbekannter Werker
Given Ein Werker meldet sich an einer Maschine mit COAGO an
When er falsche oder unbekannte Credentials eingibt
Then werden dem User entsprechende Meldungen angezeigt
And wird die Aktion in einer Datenbank-Tabelle protokolliert
