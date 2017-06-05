**Requirement ID: ** #5

**Requirement Type: ** Functional Scope of Work

**Use-Case:** #5 Order-History

---
**Erfassungsdatum:**

04.06.2017

**Author (Ersteller des Requirements):**

Matthias Hertel

**Verantwortlicher (Requirement-Engineer):**

Matthias Hertel

**Kategorie:**

- User Modell
- Order Modell

**Gewichtung:**

- [x] must-have
- [ ] nice-to-have

---
**Kurzbeschreibung:**

Der Besucher **muss** die Moeglichkeit haben sein Bestellungen einzusehen.

**Beschreibung:**

Der User sieht seine Bestellungen ein.

Es gibt eine Einzelansicht der Bestellung.

Scope:

- bestellte Produkte
  - Produktnummer
  - Anzahl
  - Preis

- Status der Bestellung
  - in Bearbeitung
  - wird ausgeliefert
    - Pakettracking-ID
  - abgeschlossen
  - retoureversand

- Rechnungseinsicht
  - pdf

- Reklamation
  - widerruf
  - retoureversand



---
**Referenz auf den Use Case:**

#5 Order-History

**Referenz auf sonstige Dokumente:**


- DB-Schema: User, Profil, Order
- Wireframe (Profilansicht)
- Wireframe (Bestellhistorie Listenansicht)
- Wireframe (Bestellhistorie Einzelansicht)


---
**Abnehmer des Requirements:**

- Matthias Hertel
- Accounting / ISM
- Invoicemanagement

**Abnahmekriterium des Requirements:**

Profilseite
Bestellungsuebersicht
Einzelansicht der Bestellungen (Bestellstatus)


---
**Priorität (Dringlichkeit):**


 - [ ] 1 - sehr niedrig
 - [ ] 2 - niedrig
 - [ ] 3 - mittel
 - [ ] 4 - hoch
 - [x] 5 - sehr hoch


---
**Konflikte:**
- keine

---
**Abhängigkeiten:**

- Datenbankschema (User)
- Datenbankschema (Role)
- Datenbankschema (Profil)
- Datenbankschema (Bestellungen)

- Requirements:
  - #1
  - #2
  - #4
  - #11 Profilpagelayout


---
**juristische Relevanz:**

- Verwendung personenbezogener Daten


---
**sonstige Anmerkungen:**




---
**Bearbeitungshistorie:**

version: 1.0
