package fivecardstud.logic;

/**
 * Rajapinta eriarvoisille pokerikäsille.
 */
public interface Rank {

    /**
     * Antaa mahdollisuuden vertailla eriarvoisia pokerikäsiä palauttaen
     * suuremman arvon paremmalle pokerikädelle verrattuna huonompaan.
     *
     * @return käden arvo numerona.
     */
    int rankAsNumber();

    /**
     * Vertaa kahta pokerikättä toisiinsa.
     * @param r toinen pokerikäsi
     * @return kertoo onko käsi parempi vai huonompi
     */
    int compareTo(Rank r);
}
