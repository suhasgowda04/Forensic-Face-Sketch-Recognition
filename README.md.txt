 # 🔍 Forensic Face Sketch Construction and Recognition

> AI-powered desktop application for constructing forensic face sketches and identifying suspects using JavaFX, AWS Rekognition, AWS S3, and SQLite.

---

## 📖 Project Overview

Forensic Face Sketch Construction and Recognition is a desktop application designed to assist forensic investigations by enabling investigators to digitally construct suspect face sketches and compare them against a facial image database.

The application provides an intuitive JavaFX-based interface for assembling facial components such as eyes, nose, mouth, hair, eyebrows, ears, and facial accessories. The completed sketch is processed using Amazon Rekognition to identify the closest matching face from the stored dataset.

This project combines cloud-based facial recognition with an interactive desktop application to improve the speed and efficiency of suspect identification.

---

## ✨ Key Features

- Digital face sketch construction
- Interactive JavaFX user interface
- Drag-and-drop facial component selection
- User authentication
- SQLite database integration
- AWS S3 image storage
- AWS Rekognition face matching
- Face search and identification
- Modular project architecture

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Core application |
| JavaFX | Desktop UI |
| Scene Builder | UI Design |
| SQLite | Local database |
| AWS S3 | Cloud image storage |
| AWS Rekognition | Face recognition |
| Maven | Dependency management |
| NetBeans IDE | Development |

---

## 📁 Repository Structure

```text
Forensic-Face-Sketch-Recognition
│
├── SketchBuilder/
├── FaceRecognition/
├── docs/
├── README.md
├── LICENSE
└── .gitignore
```

---

## ⚙️ How It Works

1. User logs into the application.
2. Facial components are selected to construct a sketch.
3. The generated sketch is prepared for matching.
4. The image is uploaded to AWS S3.
5. Amazon Rekognition compares the sketch against stored facial images.
6. The closest matching faces are displayed.

---

## 🚀 Installation

1. Clone this repository.
2. Open **SketchBuilder** in NetBeans.
3. Configure JavaFX.
4. Configure AWS credentials (your own credentials).
5. Run the SketchBuilder module.
6. Open the FaceRecognition module.
7. Execute facial recognition.

---

## 📄 Project Documentation

The complete project report is available in the **docs** folder.

---

## 🔮 Future Enhancements

- AI-assisted sketch generation
- Deep learning based face recognition
- Real-time CCTV integration
- Mobile application support
- Criminal database synchronization
- Multi-user access

---

## 👨‍💻 Author

**Suhas D S**

Bachelor of Engineering – Information Science & Engineering

Maharaja Institute of Technology, Mysore

---

## 📜 License

This project is licensed under the MIT License.