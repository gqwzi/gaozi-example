package com.gao.gaozi.example.testString;

public class TestString {

    public static void main(String[] args) {
        System.out.println(before13Html());
        System.out.println(after13Html());
    }

    public static String before13Html() {
        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";
        return html;
    }

    public static String after13Html() {
        String html = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;
        return html;
    }
}
