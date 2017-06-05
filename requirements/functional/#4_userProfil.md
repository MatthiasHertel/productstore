**Requirement ID: ** #4

**Requirement Type: ** Functional Scope of Work

**Use-Case:** #4 User-Profil

---
**Erfassungsdatum:**

04.06.2017

**Author (Ersteller des Requirements):**

Matthias Hertel

**Verantwortlicher (Requirement-Engineer):**

Matthias Hertel

**Kategorie:**

- User Modell

**Gewichtung:**

- [x] must-have
- [ ] nice-to-have

---
**Kurzbeschreibung:**

Der Besucher **muss** die Moeglichkeit haben sein Profil zu bearbeiten.

**Beschreibung:**

Der User editiert sein Profil.

<u> editierbare Felder: </u>

- Vorname
- Nachname
- Email (neue Email verifizieren siehe Requirement: #1)

- Lieferadresse (multiple)
  - Adresse 1
  - Adresse 2
  - Postleitzahl
  - Stadt
  - Land

- Zahlungsmoeglichkeiten (multiple)
  - Kreditkarte
    - Nummer
    - Inhaber
    - CVS
  - Paypal
  - Lastschrift

- weitere:
  - Telefonnummer
  - Avatar

---
**Referenz auf den Use Case:**

#4 User-Profil

**Referenz auf sonstige Dokumente:**


- DB-Schema: User, Passwort-Reset, Profil
- Wireframe (Profilansicht)


---
**Abnehmer des Requirements:**

- Matthias Hertel
- Accounting / ISM
- Invoicemanagement

**Abnahmekriterium des Requirements:**

Profilseite
Profil Editierungs Formular

Verifizierung der Zahlungsmoeglichkeiten


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

- Requirements:
  - #1
  - #2


---
**juristische Relevanz:**

- Verwendung personenbezogener Daten
- Verwendung von Zahlungsmoeglichkeiten
- Invoicemanagement


---
**sonstige Anmerkungen:**

- Sicherheit: erneute Verifizierung der Emailadresse
- Sicherheit: Verifizierung der Kreditkarte

---
**Bearbeitungshistorie:**

version: 1.0
