package npc;

import the_adventure.Player;

public class Torbjornemail extends Npc {

	private static int damage = 20;
	private Boolean redemail = false;
	
	public Torbjornemail(String name) {
		super(name);
	}
	
	@Override
	public void addCommands() {
		this.addCommand("read " + this.getName(), (Player player) -> this.attack(player, damage));
	}
	
	@Override
	public void observe() {
		if (!redemail) {
			System.out.print("You have a email on your phone.\n");
		}
	}
	
	public void attack(Player player, int amount) {
		player.subtractStamina(amount);
		System.out.printf("%s: %s\n", getMail(), this.getName());
		redemail = true;
	}
	
	private static String getMail() {
		return  "Hejsan.\n" + 
				"\n" + 
				"Förhoppningsvis når jag nu alla som skall gå kursen TDDD11 i vår (nya kursmailinglistor). Om inte så hoppas jag att ni sprider detta till dem som inte fått mailet (av era kompisar).\n" + 
				"\n" + 
				"Det hänt en del saker som vi inte visste om innan jul och som kommer att påverka er vad det gäller kommunikationen med oss. Jag kommer till detta, men först lite kort om vad som händer nu i veckan (inför kursstarten).\n" + 
				"\n" + 
				"Allra först vill jag påminna om att läsa det mail jag skickade till er i höstas. En massa information där om hur kursen startar och så. Jag tar inte allt detta igen här.\n" + 
				"\n" + 
				"\n" + 
				"Kurshemsidorna\n" + 
				"\n" + 
				"Vi kommer inom mycket kort att lägga ut vårens uppsättning av kurshemsidorna. Det har varit mycket som hänt så vi har tyvärr inte hunnit få fram dem tills nu. Kort kan vi säga att det inte är speciellt mycket som skiljer från förra året som om ni tittar på förra årets sidor vad det gäller kursbok och så tror jag att det mesta kommer att vara ok.\n" + 
				"\n" + 
				"Kurshemsidan finns här: www.ida.liu.se/~TDDD11\n" + 
				"\n" + 
				"OBS! Googla inte kurshemsidan! Söker ni på kurskod hamnar ni i Lisam och det är inte där vi kommer att vara i denna kurs.\n" + 
				"\n" + 
				"\n" + 
				"Kursboken\n" + 
				"\n" + 
				"Om ni har skaffat denna rekommenderar jag att ni skummar de första 5 kapitlen (det är vad första kursveckan handlar om ungefär). Ni får ha med kursboken på duggan och även tentan senare.\n" + 
				"\n" + 
				"OBS! SKUMMA betyder INTE \"lusläs och förstå allt\" utan verkligen i detta fall bara skumma, d.v.s. ögna igenom och få en bild av vad som kommer. Bara att ha gjort detta gör att ni kommer att hänga med mycket bättre i början och förstå vad vi pratar om på ett mycket bättre sätt.\n" + 
				"\n" + 
				"\n" + 
				"Nyheter från föregående år\n" + 
				"\n" + 
				"Några saker som kommer att skilja är:\n" + 
				"\n" + 
				"    Schemat (förstås), men det ser ni i TimeEdit så det är ju inte katastrof.\n" + 
				"\n" + 
				"    Deadlines.\n" + 
				"\n" + 
				"    Dugga (kommer bara att vara en, ändring från förra året, och den kommer i vecka 5, 2019-01-28). Mer om den på FÖ och på kurshemsidan om ett tag. Anmälan till denna beskrivs då.\n" + 
				"\n" + 
				"    Bonussystemet ändrat från förra året (tillbaka till det som var tidigare). Mer på FÖ och hemsida senare.\n" + 
				"\n" + 
				"    \"GULD-grupp\"-regler ändrade lite grann.\n" + 
				"\n" + 
				"\n" + 
				"Det finns mer som händer, men vi tar det senare.\n" + 
				"\n" + 
				"\n" + 
				"Registrering till kursen (nu i vår)\n" + 
				"\n" + 
				"På måndag om en vecka (samma dag som kursen startar) är det viktigt att ni registrerar er till kursen. Vi kommer inte att kunna se er i våra system om ni inte gör detta som det ser ut. Det innebär antagligen strul med många saker. T.ex.:\n" + 
				"\n" + 
				"    Inloggning på våra datorer i datorsalarna.\n" + 
				"\n" + 
				"    Plats i labgrupper. Efter 3 veckor (fredag vecka 6) ser vi de som inte är registrerade på kursen som att de inte följer kursen och ni får då inte följa labserien då vi behöver assistenterna till dem som verkligen går kursen).\n" + 
				"\n" + 
				"    Tentaanmälan (senare).\n" + 
				"\n" + 
				"    Registrering av resultat i LADOK.\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"Registrering till labgrupper i kursen (i LUPP)\n" + 
				"\n" + 
				"Här kommer den andra registreringen som ni behöver göra. Denna skall ni kunna göra inom kort och det bör ni göra innan ni kommer till er första laboration. Är man inte registrerad här inom de 3 första veckorna (senast vecka 6 på fredagen) åker man alltså ut och är man registrerad här, men inte registrerad på kursen enligt förra registreringsbeskrivningen gäller alltså detsamma.\n" + 
				"\n" + 
				"VIKTIGT! Kolla först upp i TimeEdit vilka tider som är för \"Grupp A\" respektive \"Grupp B\" (det är inte klassbeteckningar vi pratar om utan labgrupper inom klasserna) på labtiderna. Det finns information i TimeEdit om detta för varje laboration om allt gått in som det skall. Den labgrupp som heter \"Grupp A\" kommer alltså att ha hälften av tiderna i schemat och den andra har resterande tider förstås.\n" + 
				"\n" + 
				"Logga sen in i LUPP (ett förenklat labresultatshanteringssystem vi har i vår grupp på IDA) och registrera dig till den grupp (A eller B) som passar dig bäst (i din klass förstås). Det kommer ett separat mail om LUPP inom några dagar.\n" + 
				"\n" + 
				"Vi öppnar registreringen till labgrupper när LUPP-mailet dyker upp.\n" + 
				"\n" + 
				"OBS! Är man inte registrerad i LUPP senast första veckan (vecka 4) på onsdagen kan man inte vara med på duggan som kommer på måndagen efter. Mer om detta på FÖ senare. Det kommer information även om denna lite senare (många mail i början av kursen, men det minskar lite senare).\n" + 
				"\n" + 
				"\n" + 
				"MAIL och RÄTTSÄKERHET (nytt från NU)\n" + 
				"\n" + 
				"Det som är riktigt viktigt och som jag fick reda på i fredags är att det har blivit rejält omstrukturerat gällande mailhanteringen på LiU. Detta ser jag som ett ganska stort problem då vissa saker i detta är rent felaktiga ur er synvikel (som jag ser det). Ni hamnar i ett läge där ni kan råka illa ut och det vill jag inte.\n" + 
				"\n" + 
				"Det som hänt (vad jag hört) är att ni inte automatiskt har er LiUid-mailadress som den som vi når er på via mail när vi skickar saker via mailinglistor som skapas centralt. Istället hamnar den mailadress ni angav när ni registrerade er som den aktiva mailadressen. Vad menar jag nu kanske ni undrar?\n" + 
				"\n" + 
				"Jag tar det som ett par exempel så hoppas jag att det blir lättförståeligt.\n" + 
				"\n" + 
				"    1. Om du har din \"LiUid-mailadress\" som den som du får mail på och skickar mail via när det gäller studentsakerna på LiU då har du en mailadress om slutar med \"@student.liu.se\" och före detta har du ditt LiUid. Detta är isåfall SUPERBRA. Då blir allt perfekt i fortsättningen.\n" + 
				"\n" + 
				"    2. Om du har annan adress (som t.ex. \"@gmail.com\", \"@hotmail.com\" eller andra (förlåt uttrycket) \"obskyra mailadresser\" där vi inte kan identifiera att ni verkligen är en student som går på LiU och tillhör våra kurser) kommer det inte att bli bra.\n" + 
				"\n" + 
				"\n" + 
				"Varför är detta dåligt kanske ni undrar om ni tillhör punkt 2 ovan. Några exempel som jag hoppas att ni köper. Läs dessa då det finns information inbakad i detta!\n" + 
				"\n" + 
				"    A. Vi vet inte att det är just du som skickar mailet då vem som helst kan skapa mailadresser på t.ex. \"gmail.com\" med vilket namn som helst i princip. Vi vill då inte skicka känslig information tillbaka till den adressen. För att göra det enkelt menar vi då all information i våra kurser för att inte behöva fundera på vad som är känsligt och ej.\n" + 
				"\n" + 
				"    B. När vi skickar ut information till studenterna vet vi inte ens att den mailadress ni har registrerad är aktiv (även om den var det när ni registrerade er på LiU). Detta gör att ni missar information (det kan ju vara så att detta mail inte kommer till vissa av era kompisar så sprid denna information till alla i era klasser).\n" + 
				"\n" + 
				"    C. När vi skickar information till er alla via mail (vilket vi gör en del i denna kurs där vi har ca 250-300 studenter som ställer frågor och vi då \"ibland\" svarar till er alla för att det skall slippas skickas många lika svar från oss) skickar vi alltid via de automatiska kursepostlistorna (som vad jag förstår är kopplade till eventuellt felaktiga mailadresser om ni inte tillhör punkt 1 ovan).\n" + 
				"\n" + 
				"    D. När ni senare tentar i vårt datortentasystem kommer ni att få mail till er \"@student.liu.se\"-mailadress (denna väljs \"automatiskt\" från tentasystemet då vi inte kan leta reda på \"obskyra\" mailadresser och verifiera att de tillhör er) med era resultat och filer etc.\n" + 
				"\n" + 
				"    E. Då vi har massor med kurser (även parallellt) och får MASSOR av mail (kan vara mer än 100 per dag i vissa perioder från diverse håll) är det av yttersta vikt att ni skriver tydliga rubriker (med inledande kurskod) och att ni skickar från era LiUid-mailadresser då vi på detta sett hittar era mail snabbare och vi direkt också vet vilken kurs det gäller och kan svara snabbare. Vi prioriterar alltid våra aktiva kurser i möjligaste mån. Ni ser att jag i detta mail har gjort så och då visste ju ni också att det gällde denna kurs. Bra va!\n" + 
				"\n" + 
				"\n" + 
				"Som jag ser det är det av yttersta vikt att ni ser till att ni ser till att ni använder er LiUid-mailadress. Jag tror att ni kommer att tjäna på det i alla väder, men åtminstone helt i vår kurs. Jag tror även i andra kurser.\n" + 
				"\n" + 
				"Jag hoppas att ni inte ser detta som att jag vill vara \"pappa\" åt er. Jag vill bara att det skall bli bra för er. Jag hoppas att ni litar på detta.\n" + 
				"\n" + 
				"\n" + 
				"Avslutningsvis\n" + 
				"\n" + 
				"Jag ber om ursäkt att det blev ett långt mail, men det är viktig information som jag ser det.\n" + 
				"\n" + 
				"Sprid detta till era (klass)kompisar och välkomna på FÖ på måndag om drygt en vecka.\n" + 
				"\n" + 
				"M.v.h.\n" + 
				"/TJ\n" + 
				"--\n" + 
				"-------------------------------------\n" + 
				"_/_/_/_/_/_/_/_/ Torbjörn Jonsson\n" + 
				"_/ _/ 013-28 24 67\n" + 
				"_/ _/ Torbjorn.Jonsson@LiU.SE\n" + 
				"_/ _/ _/ IDA/SaS/UPP\n" + 
				"_/ _/_/ Institutionen för Datavetenskap\n" + 
				"---------- Linköpings universitet";

	}
	


}
