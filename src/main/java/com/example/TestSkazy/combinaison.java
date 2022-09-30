package com.example.TestSkazy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class combinaison {
    @PostMapping("/baoloc/{a}/{b}/{c}/{d}/{e}/{f}/{g}/{h}/{i}")
    public String postCombinaison(@PathVariable String a, @PathVariable String b, @PathVariable String c,
            @PathVariable String d,
            @PathVariable String e, @PathVariable String f, @PathVariable String g, @PathVariable String h,
            @PathVariable String i) {
        Boolean result = baoloc(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c),
                Integer.parseInt(d),
                Integer.parseInt(e), Integer.parseInt(f), Integer.parseInt(g),
                Integer.parseInt(h), Integer.parseInt(i));

        // INSERT dans la base
        return result ? "Yes" : "No";
    }

    @GetMapping("/baoloc/{a}/{b}/{c}/{d}/{e}/{f}/{g}/{h}/{i}")
    public String getCombinaison(@PathVariable String a, @PathVariable String b, @PathVariable String c,
            @PathVariable String d,
            @PathVariable String e, @PathVariable String f, @PathVariable String g, @PathVariable String h,
            @PathVariable String i) {

        // SELECT dans la base
        return "d";
    }

    @DeleteMapping("/baoloc/{a}/{b}/{c}/{d}/{e}/{f}/{g}/{h}/{i}")
    public String deleteCombinaison(@PathVariable String a, @PathVariable String b, @PathVariable String c,
            @PathVariable String d,
            @PathVariable String e, @PathVariable String f, @PathVariable String g, @PathVariable String h,
            @PathVariable String i) {

        // DELETE dans la base
        return "No";
    }

    private static Boolean baoloc(int a, int b, int c, int d, int e, int f, int g, int h, int i) {
        return (a + (13 * b) / c + d + 12 * e - f - 11 + (g * h) / i - 10) == 66;
    }

}
