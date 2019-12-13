public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a1 = new Author("Maria", "jackfassorick@yandex.ru", 'F');
        System.out.println(a1);
        a1.setEmail("jackfassorick@yandex.ru");
        System.out.println(a1);
    }
}

