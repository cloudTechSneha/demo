# My App Demo (Maven + GitHub Actions)

This is a **demo project** showing how to set up **automated pull request validation** using GitHub Actions, Maven, JaCoCo, and PR rules.

---

## 📂 Project Structure
```
my-app/
├── pom.xml                  # Maven build configuration
├── src/main/java/com/example/App.java
├── src/test/java/com/example/AppTest.java
.github/
├── workflows/pr-validation.yml   # GitHub Actions workflow
└── pull_request_template.md      # PR template (with JIRA ID requirement)
```

---

## ⚙️ What happens on every Pull Request
1. **Build & Test**
   - Runs `mvn clean test`
   - Ensures code compiles and tests pass

2. **Code Coverage**
   - Uses JaCoCo
   - Extracts line coverage %
   - Posts coverage results as a PR comment

3. **Code Quality**
   - `mvn fmt:check` → checks formatting (Google Java Style)
   - `mvn checkstyle:check` → static code analysis

4. **PR Rules**
   - PR description must include a **JIRA ID** (e.g., `JIRA-123`)
   - PR must have at least **one label** applied

5. **Branch Protection**
   - You can enable branch protection in GitHub settings so that PRs cannot be merged unless all checks pass.

---

## 🚀 How to Use
1. Clone this repo and push it to your GitHub account.
2. Enable **GitHub Actions** (it runs automatically on pull requests).
3. Enable **branch protection rules**:
   - Require PR reviews before merging
   - Require status checks to pass (`PR Validation (Maven)`)
4. Open a Pull Request → watch GitHub Actions run.

---

## ✅ Example Output in PR
- ✅ Build & Test Passed
- 📊 Line Coverage: **85%**
- ❌ Missing JIRA ID (if not included in description)
- ❌ No labels found (if not applied)

---

## 🛠️ Commands
- Run tests locally:
  ```bash
  cd my-app
  mvn clean test jacoco:report
  ```

- Format code (Google Style):
  ```bash
  mvn fmt:format
  ```

- Checkstyle validation:
  ```bash
  mvn checkstyle:check
  ```

---

## 🎯 Purpose
This setup is useful for:
- Demonstrating **CI/CD pipelines**
- Enforcing **code quality & standards**
- Ensuring **PRs are reviewed and properly formatted**
