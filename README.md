<div align="center">

# 🔒 Deadlock in Java

[![GitHub stars](https://img.shields.io/github/stars/Shubh2-0/Deadlock-In-Java?style=for-the-badge&logo=github&color=yellow)](https://github.com/Shubh2-0/Deadlock-In-Java/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Shubh2-0/Deadlock-In-Java?style=for-the-badge&logo=github&color=blue)](https://github.com/Shubh2-0/Deadlock-In-Java/network/members)

### Understanding Thread Deadlocks

*Learn what causes deadlock and how to prevent it*

</div>

---

## 🎯 About

This repository demonstrates **deadlock** scenarios in Java multithreading. Learn to identify, understand, and prevent deadlocks in concurrent applications.

## 📁 Projects

| Project | Scenario |
|---------|----------|
| **Printer Scanner** | Resource deadlock simulation |
| **Water Spices** | Practical deadlock example |

## 💡 What is Deadlock?

```
Thread A                    Thread B
   │                           │
   │ holds Resource1           │ holds Resource2
   │ waits for Resource2       │ waits for Resource1
   │          │                │         │
   └──────────┼────────────────┼─────────┘
              │   DEADLOCK!    │
              └────────────────┘
```

## 🛡️ Prevention Techniques

- ✅ Acquire locks in consistent order
- ✅ Use timeout for lock acquisition
- ✅ Avoid nested locks
- ✅ Use concurrent utilities

## 🛠️ Technologies

Java | Multithreading | Synchronization

## 📬 Contact

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/shubham-bhati-787319213/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:shubhambhati226@gmail.com)

---

**Keywords:** Java Deadlock Multithreading Synchronization Concurrent-Programming Thread-Safety


