Here is an updated README with the specific requirements, usage instructions, and the command to clone the repository:

---

# 📝 Task Tracker

Task Tracker is a CLI application to manage and track your tasks.

## 🚀 Features

- ➕ Add tasks
- ✏️ Update tasks
- ❌ Delete tasks
- 🔄 Mark tasks as in progress
- ✅ Mark tasks as done
- 📋 List all tasks
- 📋✅ List done tasks
- 📋❌ List not done tasks
- 📋🔄 List tasks in progress

## 📦 Requirements

- Java Development Kit (JDK) 8 or higher
- Gradle 8.13

## 🛠️ Usage

### Clone the Repository

First, clone the repository to your local machine:
```sh
git clone https://github.com/LTexocotitlaP/TaskTracker.git
cd TaskTracker
```

### Run the Application

To run the application, use the following commands:

### Add a task
```sh
./gradlew run --args="add 'Task name' 'Task description'"
```
On Windows:
```sh
./gradlew.bat run --args="add 'Task name' 'Task description'"
```

### Update a task
```sh
./gradlew run --args="update <id> 'New task name' 'New task description'"
```
On Windows:
```sh
./gradlew.bat run --args="update <id> 'New task name' 'New task description'"
```

### Delete a task
```sh
./gradlew run --args="delete <id>"
```
On Windows:
```sh
./gradlew.bat run --args="delete <id>"
```

### Mark a task as in progress
```sh
./gradlew run --args="inprogress <id>"
```
On Windows:
```sh
./gradlew.bat run --args="inprogress <id>"
```

### Mark a task as done
```sh
./gradlew run --args="done <id>"
```
On Windows:
```sh
./gradlew.bat run --args="done <id>"
```

### List all tasks
```sh
./gradlew run --args="list"
```
On Windows:
```sh
./gradlew.bat run --args="list"
```

### List done tasks
```sh
./gradlew run --args="list done"
```
On Windows:
```sh
./gradlew.bat run --args="list done"
```

### List not done tasks
```sh
./gradlew run --args="list notdone"
```
On Windows:
```sh
./gradlew.bat run --args="list notdone"
```

### List tasks in progress
```sh
./gradlew run --args="list inprogress"
```
On Windows:
```sh
./gradlew.bat run --args="list inprogress"
```

## 🗂️ JSON File Example

```json
[
    {
        "id": 1,
        "name": "Task name",
        "description": "Task description",
        "status": "not done"
    },
    {
        "id": 2,
        "name": "Another task",
        "description": "Another description",
        "status": "in progress"
    }
]
```

## 🤝 Contributions

1. Fork the repository
2. Create a new branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Open a Pull Request

---

I hope this README helps with your project!