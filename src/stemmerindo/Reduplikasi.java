/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stemmerindo;

import java.util.List;

public class Reduplikasi {

    private final List dictionaries;

    public Reduplikasi(List dictionaries) {
        this.dictionaries = dictionaries;
    }

    public String remove(String keyword) {
        // contoh: abu-abu, terang-terangan
        if (keyword.contains("-")) {
            String firstParticle = keyword.substring(0, keyword.indexOf("-"));
            String secondParticle = keyword.substring(keyword.indexOf("-") + 1);
            if (this.dictionaries.contains(secondParticle)) {
                keyword = secondParticle;
            } else if (this.dictionaries.contains(firstParticle)) {
                keyword = firstParticle;
            } else {
                keyword = secondParticle;
            }
        }
        return keyword;
    }
}
