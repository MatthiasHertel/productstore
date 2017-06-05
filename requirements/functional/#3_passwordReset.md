**Requirement ID: ** #3

**Requirement Type: ** Functional Scope of Work

**Use-Case:** #3 Passwort-Resset

---
**Erfassungsdatum:**

04.06.2017

**Author (Ersteller des Requirements):**

Matthias Hertel

**Verantwortlicher (Requirement-Engineer):**

Matthias Hertel

**Kategorie:**

- Userauthentifizierung

**Gewichtung:**

- [x] must-have
- [ ] nice-to-have

---
**Kurzbeschreibung:**

Der Besucher **muss** die Moeglichkeit haben sein Passwort zu reseten.

**Beschreibung:**

Story:
Der Besucher hat sein Passwort vergessen.

Er kann sich ueber ein Formular mit Eingabe seiner Email einen Link (Token) zu senden lassen worueber er ein neues Passwort eingeben kann.



---
**Referenz auf den Use Case:**

#3 Passwort-Reset

**Referenz auf sonstige Dokumente:**


- DB-Schema: User, Passwort-Reset
- Wireframe (Passwort-Reset-Formular)


---
**Abnehmer des Requirements:**

- Matthias Hertel
- Accounting / ISM

**Abnahmekriterium des Requirements:**

Generierung des Tokens
Gueltigkeitsdauer des Tokens


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

- Requirements:
  - #1
  - #2

---
**juristische Relevanz:**

- Verwendung personenbezogener Daten


---
**sonstige Anmerkungen:**

- Sicherheit: Schutz vor zuvielen Versuchen (Captcha)
- Sicherheit: Generierung des Tokens
- Sicherheit: Gueltigkeitsdauer des Tokens

---
**Bearbeitungshistorie:**

version: 1.0
