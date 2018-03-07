
import fighters.Highlander;
import fighters.Swordsman;
import fighters.Viking;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 *
 * This is a duel simulation
 *
 * Blow exchange are sequential, A engage B means that A will give the first blow, then B will respond
 *
 */
public class TournamentTest {


    /**
     * A fighters.Swordsman has 100 hit points and use a 1 hand sword that does 5 dmg
     * A fighters.Viking has 120 hit points and use a 1 hand axe that does 6 dmg
     */
    @Test
    public void SwordsmanVsViking() {

        Swordsman swordsman =  new Swordsman();

        Viking viking = new Viking();

        swordsman.engage(viking);

        assertThat(swordsman.hitPoints()).isEqualTo(0);
        assertThat(viking.hitPoints()).isEqualTo(35);

    }

    /**
     * a buckler cancel all the damages of a blow one time out of two
     * a buckler is destroyed after blocking 3 blow from an axe
     */
    @Test
    public void SwordsmanWithBucklerVsVikingWithBuckler() {

        Swordsman swordsman = new Swordsman()
                .equip("buckler");

        Viking viking = new Viking()
                .equip("buckler");

        swordsman.engage(viking);

        assertThat(swordsman.hitPoints()).isEqualTo(0);
        assertThat(viking.hitPoints()).isEqualTo(70);

    }

    /**
     * an fighters.Highlander as 150 hit points and fight with a Great Sword
     * a Great Sword is a two handed sword deliver 12 damages, but can attack only 2 every 3
     * an armor : reduce all received damages by 3 & reduce delivered damages by one
     */
    @Test
    public void ArmoredSwordsmanVsViking() {
        Highlander highlander = new Highlander();

        Swordsman swordsman =  new Swordsman()
                .equip("buckler")
                .equip("armor");

        swordsman.engage(highlander);

        assertThat(swordsman.hitPoints()).isEqualTo(0);
        assertThat(highlander.hitPoints()).isEqualTo(10);

    }

    /**
     * a vicious fighters.Swordsman is a fighters.Swordsman that put poison on his weapon.
     * poison add 20 damages on two first blows
     * a veteran fighters.Highlander goes Berserk once his hit points are under 30% of his initial total
     * once Berserk, he doubles his damages
     */
    /*@Test
    public void ViciousSwordsmanVsVeteranHighlander() {

        fighters.Swordsman swordsman = new fighters.Swordsman("Vicious")
                .equip("axe")
                .equip("buckler")
                .equip("armor");

        fighters.Highlander highlander = new fighters.Highlander("Veteran");

        swordsman.engage(highlander);

        assertThat(swordsman.hitPoints()).isEqualTo(1);
        assertThat(highlander.hitPoints()).isEqualTo(0);

    }*/

}
