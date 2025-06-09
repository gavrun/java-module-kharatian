# java-module-kharatian

This repository is used as part of a learning process, with a focus on practicing real-world GitHub collaboration.


## Purpose

The goal is to simulate a professional software development workflow, including:

- Working in feature branches
- Creating pull requests (PRs)
- Receiving and applying code review feedback
- Merging changes after approval

This helps to build habits essential for team-based development.


## Branch protection mimicking

To enforce the workflow:
- `main` branch is protected.
- Pull requests **require at least one approval** before merging.
- The repository owner (me) cannot merge without an approval.


## Workflow

1. **New Feature Branch**
   - I create a separate branch for each new feature or task.
   - Example: `feature/add-new-func`

2. **Development**
   - Code is written and committed locally.
   - Commits are descriptive.

3. **Push and Pull Request**
   - The branch is pushed to GitHub.
   - A Pull Request is opened targeting the `main` branch.
   - The PR includes a meaningful title and description of changes.

4. **Code Review by Instructor**
   - The instructor, added as a *Collaborator*, reviews the PR.
   - Inline comments and suggestions may be added.
   - The review may result in:
     - **Approval**, or
     - **Request for changes**

5. **Applying Feedback**
   - If needed, I push additional commits addressing feedback.
   - The PR is updated automatically.

6. **Merge After Approval**
   - Once approved, I merge the PR into the `main` branch.
   - The feature branch is deleted afterward (optional cleanup).

