# Todo App

Bu proje, bir todo uygulamasıdır ve ana teması Retrofit kullanımını göstermektir. Projede aşağıdaki yapılar ve kütüphaneler kullanılmıştır:

- **RecyclerView**:
    - `Adapter` ->`TodoAdapter.kt`: RecyclerView için bir adapter sınıfıdır.
    - `Card Tasarımı` -> `item_todo.xml`: Uygulamadaki todo öğelerini göstermek için kart tasarımı kullanılmıştır.
    
- **Retrofit Yapısı**:
    - `Retrofit Kütüphanesi`: Retrofit kütüphanesi, API çağrılarını gerçekleştirmek için kullanılmıştır.
    - `RetrofitInstance`: Retrofit instance'ı oluşturulmuştur.
    - `TodoAPI`: API servislerini tanımlamak için kullanılan arayüzdür.
 
<p>Retrofit, HTTP isteklerini yapmak ve RESTful API'leri kullanarak veri almak veya göndermek için yaygın olarak kullanılan bir Java ve Kotlin kütüphanesidir.
  Bu proje, Retrofit'in nasıl kullanılacağını ve <code>@GET</code> işlevinin amacını öğrenmek için harika bir fırsat sunar.
  <code>@GET</code> işlevi, bir GET isteği yapmak için kullanılır ve belirli bir URL'den veri almanızı sağlar.</p>

## Kurulum

Projeyi çalıştırmak için aşağıdaki adımları takip edebilirsiniz:

1. **Depoyu klonlayın**: 

    ```shell
    git clone <https://github.com/kberktavli/RetrofitGuidePrep>
    ```

2. **Projeyi açın**:

    - Android Studio veya tercih ettiğiniz bir IDE'de projeyi açın.

3. **Gerekli paketleri yükleyin**:

    - Proje, gerekli paketleri yüklemek için `gradle` kullanır. İhtiyaç duyulan paketlerin otomatik olarak yüklenmesi için projeyi derleyin.

4. **Uygulamayı başlatın**:

    - Projeyi başlatarak uygulamayı çalıştırabilirsiniz.

## Uygulama Ekran Kaydı

Aşağıda uygulamanın bir ekran kaydını görebilirsiniz:

<video width="640" height="360" controls>
  <source src="screen-record.mp4" type="video/mp4">
</video>
