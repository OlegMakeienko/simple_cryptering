
---

# SimpleCryptering - En fullstack-applikation för textkryptering och avkryptering

Detta projekt är en enkel fullstack-applikation som tillhandahåller funktionalitet för att kryptera och avkryptera text. Projektet är byggt med en Java-backend för krypteringslogik och en frontend som låter användare interagera med krypterings- och dekrypteringsfunktionerna via en webbsida. CI/CD-automatisering implementeras med hjälp av GitHub Actions.

## Funktionalitet

### Backend
- **Kryptering och dekryptering**: Backend erbjuder funktioner för att kryptera och dekryptera text med en Caesar-krypteringsmetod.
- **API-endpoints**:
    - `GET /api/cryptography/encrypt`: Tar emot en textsträng som query-parameter och returnerar en krypterad version av texten.
    - `GET /api/cryptography/decrypt`: Tar emot en krypterad textsträng som query-parameter och returnerar den ursprungliga texten.

### Frontend
- En enkel HTML-webbsida som låter användaren ange text för kryptering och dekryptering.
- Knapp för "Encrypt" för att kryptera text och visa resultatet.
- Knapp för "Decrypt" för att dekryptera text och visa resultatet.

## Teknisk beskrivning

### Java-backend
- En `Cryptography`-klass som implementerar enkla krypterings- och dekrypteringsfunktioner med hjälp av en Caesar-shift på 3 steg.
- En `CryptographyController` som tillhandahåller REST-API endpoints för kryptering och dekryptering.

### CI/CD-flöde
- Projektet använder GitHub Actions för CI/CD och automatiserar följande steg:
    1. **Kodcommit och pull request**: Varje commit och pull request till `main`-grenen triggar pipeline-flödet.
    2. **Bygg och testa**:
        - Installation av beroenden och kompilering av Java-koden.
        - Backend- och funktionstester körs automatiskt.
    3. **Deploy**: Pipeline kan konfigureras för att deploya applikationen till staging och produktion om alla tester klarar sig.

## Figma-skiss av CI/CD-flödet
En Figma-skiss av CI/CD-flödet visar hur GitHub Actions används för att automatisera bygget, tester och deploy-processen. Skissen inkluderar steg för commit, kodgranskning, byggen och tester. Flödet beskriver också de olika funktionerna som körs automatiskt och när de triggas, till exempel vid push eller pull request till `main`-grenen.

## Installation och Körning

### Krav
- Java 17
- Maven

### Kör backend
1. Klona detta repository:
   ```bash
   git clone <repository-url>
   cd simple_cryptering
   ```
2. Bygg och kör applikationen:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### Testa backend
Kör alla enhetstester med:
```bash
mvn test
```

### Kör frontend
Öppna `index.html` i din webbläsare för att använda applikationen.

## Exempel på enhetstester

I `CryptographyTest` har vi skrivit tester som täcker:
- Kryptering och dekryptering av tomma strängar.
- Kryptering och dekryptering av null-värden.
- Hantering av specialtecken och icke-alfabetiska tecken.
- Validering av korrekt kryptering och dekryptering enligt Caesar-metoden.

## GitHub Actions-konfiguration

`.github/workflows/ci.yml` definierar CI/CD-processen:
- `push` till `main`-grenen triggar bygg- och testflödet.
- **Steg**:
    - `Checkout code`: Klonar repo för byggprocessen.
    - `Set up JDK`: Installerar JDK 17.
    - `Clear Maven cache`: Bygger projektet och uppdaterar beroenden.
    - `Run tests`: Kör enhetstester.
    - `Show Maven effective POM`: För att inspektera bygginställningarna.

---

## Projektstruktur

- `Cryptography.java`: Krypterings- och dekrypteringslogik.
- `CryptographyController.java`: REST API-kontroller.
- `CryptographyTest.java`: Enhetstester för krypterings- och dekrypteringsfunktionalitet.
- `index.html`: Frontend som låter användare kryptera och dekryptera text.

## Skiss
Se Figma-skiss https://www.figma.com/board/oBxuKsdcLzUEsSQJChHiCx/CI%2FCD-flödet-för-en-fullstack-applikation-som-krypterar%2Favkrypterar-en-text?node-id=0-1&node-type=canvas&t=AS4cKsMzpnlr8CzL-0 
för en översikt över CI/CD-flödet.

---