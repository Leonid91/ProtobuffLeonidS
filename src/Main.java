import com.yourgamecompany.*;

public class Main
{
    public static void main(String[] args) {
        /** SIMPLE DATE **/
        Util.SimpleDate.Builder gameDate =
                Util.SimpleDate.newBuilder()
                        .setDay(1)
                        .setMonth(10)
                        .setYear(2010);

        /** TIME **/
        Util.Time.Builder gameTime =
                Util.Time.newBuilder()
                        .setSeconds(15444)
                        .setMinutes(5874);

        /** GAME HISTORY **/
        VideoGameCompany.VideoGame.History.Builder gameHistory =
                VideoGameCompany.VideoGame.History.newBuilder()
                        .setGameDate("10-10-2010")
                        .setGameDuration(gameTime);

        VideoGameCompany.VideoGame.History.Builder gameHistoryWithoutOptionalFields =
                VideoGameCompany.VideoGame.History.newBuilder()
                        .setGameDate("10-10-2014");
        /** GAMES **/
        VideoGameCompany.VideoGame.Builder fifa2020 =
                VideoGameCompany.VideoGame.newBuilder()
                        .setName("FIFA 2020")
                        .setGameType(VideoGameCompany.VideoGame.EnumGameType.SPORTS)
                        .setPurchaseDate(gameDate)
                        .addGameHistory(gameHistory);

        VideoGameCompany.VideoGame.Builder morrowind =
                VideoGameCompany.VideoGame.newBuilder()
                        .setName("Morrowind")
                        .setGameType(VideoGameCompany.VideoGame.EnumGameType.ADVENTURE)
                        .setPurchaseDate(gameDate)
                        .addGameHistory(gameHistoryWithoutOptionalFields);

        VideoGameCompany.VideoGame.Builder heroesMightAndMagic3 =
                VideoGameCompany.VideoGame.newBuilder()
                        .setName("Heroes Might And Magic 3")
                        .setPurchaseDate(gameDate)
                        .addGameHistory(gameHistoryWithoutOptionalFields); // Not optional game type here

        VideoGameCompany.VideoGame.Builder heroesMightAndMagic3Bis =
                VideoGameCompany.VideoGame.newBuilder()
                        .setName("Heroes Might And Magic 3")
                        .setPurchaseDate(gameDate)
                        .addGameHistory(gameHistoryWithoutOptionalFields)
                        .setIsFavorite(true); // Not optional game type he

        /** GAME STORED IN A LIST **/
        VideoGameCompany.VideoGameMatch.Builder videoGameMatchList
                = VideoGameCompany.VideoGameMatch.newBuilder()
                .addVideoGameMatchList(fifa2020)
                .addVideoGameMatchList(morrowind)
                .addVideoGameMatchList(heroesMightAndMagic3)
                .addVideoGameMatchList(heroesMightAndMagic3Bis);

        /** DISPLAY **/
        System.out.println(videoGameMatchList.toString());
    }
}
