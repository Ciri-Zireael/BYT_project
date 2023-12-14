import java.time.LocalDate;

public class WeeklyRanking {

    private LocalDate startDate;

    private LocalDate endDate;

    public WeeklyRanking(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
    //TODO: viewRanking()

}
