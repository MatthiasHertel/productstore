**Requirement ID: ** #12

**Requirement Type: ** Functional Data Requirement

**Use-Case:** -

---
**Erfassungsdatum:**

04.06.2017

**Author (Ersteller des Requirements):**

Matthias Hertel

**Verantwortlicher (Requirement-Engineer):**

Matthias Hertel

**Kategorie:**

- Produkt Modell

**Gewichtung:**

- [x] must-have
- [ ] nice-to-have

---
**Kurzbeschreibung:**

Definition der Datenstruktur der verkaufbaren Produkte.

**Beschreibung:**

Hier das Schema einer Produktentitaet.

DB-Schema:

- ID
- Kategorie
- Name
- Beschreibung
- Status
- Preis
- UnitStock
- timestamps



---
**Referenz auf den Use Case:**



**Referenz auf sonstige Dokumente:**


- weitere DB-Schema: Product, User, Role, Cart



---
**Abnehmer des Requirements:**

- DB-Designer
- Verkaeuferinstanz

**Abnahmekriterium des Requirements:**

fertiges Produktmodell


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
- Datenbankschema (Warenkorb)
- Datenbankschema (Produkt)

- Requirements:
  - #1
  - #2
  - #4
  - #9 Produktpagelayout


---
**juristische Relevanz:**

- Verwendung personenbezogener Daten


---
**sonstige Anmerkungen:**




---
**Bearbeitungshistorie:**

version: 1.0
