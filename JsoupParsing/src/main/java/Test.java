import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.fetch_parse();
    }

    public void fetch_parse(){

        long startTime = System.currentTimeMillis();
        try {
            Document doc = Jsoup.connect("https://ladyspyder.com/footwear/").get();
            Elements list_product = doc.select("div.list_product");
            System.out.println(list_product.size());

            Elements col = list_product.select("[class=col-lg-15 col-sm-20 col-xs-30]");
            for (Element cols : col) {

                Elements cat = cols.select("div.item-cat");
                Elements product_item = cat.select("div.product-item");
                Elements span = product_item.tagName("span");
                Elements thum = span.select("div.thumb-wrap");

                Element img = thum.select("img").first();
                /**
                 * Image url
                 */
                System.out.println(img.absUrl("src"));
                /**
                 * Header h4
                 */
                System.out.println(span.select("h4").first().text());
                Element pricetag = span.select("div.price").first();
                /**
                 * Price
                 */
                System.out.println(pricetag.getElementsByTag("meta").attr("content"));
                /**
                 * Stars
                 */
                Elements stardiv = span.select("div.stars");
                Elements stars = stardiv.select("span");
                for(Element star : stars){
                    System.out.println(star.attr("class"));
                }


            }
            long endTime   = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println(totalTime);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
