public class Book {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бутылок (бутылки)";
        while (beerNum > 0) { // цикл работает, пока есть какое-то количество бутылок больше 0
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");

            // сообщения принтуюися в консоль, каждую итерацию цикла
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1; // здесь мы как бы берем бутылку, и далее проверяем, сколько бутылок осталось 
            if (beerNum == 1) { // если одна, мы заходим в это условие, и меняем содержимое переменной String на слово "бутылка"
                word = "бутылка"; // в единственном числе - ОДНА бутылка
            }
            
             
            if (beerNum > 0) {
                // и здесь выводим word, если бутылок было  равно 1, тогда в переменной word находится значение "бутылка"
                // если количество оставшихся бутылок не равно 1, то в переменной word сохранено значение "бутылок (бутылки)" то что в строке 4,
                System.out.println(beerNum + " " + word + " пива на стене");
            } else {
                
                System.out.println("Нет бутылок пива на стене");
            }

        }
    }
}
