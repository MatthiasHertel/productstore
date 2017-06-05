**Requirement ID: ** #1

**Requirement Type: ** Functional Scope of Work

**Use-Case:** #1 Registration

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

Der Besucher **muss** die Moeglichkeit haben sich auf der Website zu registrieren.

**Beschreibung:**

Der Besucher kann einen Account registrieren.

Verfahren: double opt in

<u>Zu erfassende Daten (required):</u>

- Vorname
- Nachname
- Emailadresse
- Passwort

<u>Zu erfassende Daten (optional):</u>

- Titel
- Adresse (spaeter required Kaufprozess)
- Geburtsdatum


---
**Referenz auf den Use Case:**

#1 Registration

**Referenz auf sonstige Dokumente:**

- User.sql (Schema DB)
```
sql query
```

- Role.sql
```
sql query
```


- UserRole.sql
```
sql query
```

- Wireframe (Registratrionsformular)


---
**Abnehmer des Requirements:**

- Matthias Hertel
- Marketing / Accounting

**Abnahmekriterium des Requirements:**

Abschluss der Regisitrierung mit double opt in Email


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

- Emailtemplate
- Mailversand (smtp postmarketer service (SaaS))

---
**juristische Relevanz:**

- Erhebung personenbezogener Daten


---
**sonstige Anmerkungen:**

- keine Doppelanmeldungen (Email muss unique sein.)
- Registrar muss Emailadresse verifizieren durch generierte Token Email (double opt in )

---
**Bearbeitungshistorie:**

version: 1.0
