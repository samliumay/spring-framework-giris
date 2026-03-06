# Spring Boot Intern Eğitimi - Task Manager API

@**InfinitumIT** staj eğitim serisi. Spring Boot ile katmanlı mimari, design pattern'ler ve best practice'ler üzerine haftalık oturumlar.

**Eğitmen:** @InfinitumIT - Yazılım Ekibi

## Proje

Eğitim boyunca geliştirilen uygulama: **Task Manager API** — görev yönetim sistemi.

- **Teknolojiler:** Spring Boot 4.0.3, Java 21, H2 Database, Lombok, JPA/Hibernate
- **Mimari:** Controller → Service → Repository → Database (katmanlı mimari)

```
project/
├── back-end/          # Spring Boot uygulaması
│   └── src/main/java/com/interntrainingumay/back_end/
│       ├── controller/    # HTTP isteklerini karşılar
│       ├── entity/        # JPA entity'leri (Task, TaskStatus)
│       ├── repository/    # Veritabanı erişim katmanı
│       ├── service/       # İş mantığı (TaskService)
│       └── strategy/      # Strategy Pattern (SortByDate, SortByTitle, SortByStatus)
└── front-end/         # (ilerleyen haftalarda)
```

## Haftalık Oturumlar

| Hafta | Konu | Doküman |
|-------|------|---------|
| 1 | Entity, Repository, JPA temelleri | [session1_deep_dive.pdf](week-1/session1_deep_dive.pdf) |
| 2 | Service Layer, IoC, DI, Lombok, Strategy Pattern, SOLID | [session2_deep_dive.pdf](week-2/session2_deep_dive.pdf) |
| 3 | *(devam edecek)* | — |

## Çalıştırma

```bash
cd project/back-end
./mvnw spring-boot:run
```

## Referans Doküman

Eğitim serisinin ana planı: [Proje_Task_Manager_API.pdf](Proje_Task_Manager_API.pdf)
