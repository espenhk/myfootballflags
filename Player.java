public class Player {
    private int fantasyScore;

    // Offensive players
    private int passingYards;
    private int passingTds;
    private int passingInts;
    private int rushingYards;
    private int rushingTds;
    private int receptions;
    private int recievingYards;
    private int recievingTds;
    private int twoPointConversions;
    private int fumblesLost;
    private int fumbleRecoveryTds;

    // Team Defense / Special Teams
    private int teamSacks;
    private int teamInterceptions;
    private int teamFumbleRecoveries;
    private int safeties;
    private int teamDefensiveTds;
    private int kickReturnTds; // also punt recs
    private int pointsAllowed;


    // Individual defensive players
    private int soloTackles;
    private int assistedTackles;
    private int sacks;
    private int sackYards;
    private int tacklesForLoss;
    private int QBhits;
    private int passesDefended;
    private int fumblesForced;
    private int fumbleRecoveries;
    private int defensiveTds;
    private int twoPointConversionReturns;

    // Kicking
    private int patsMade;
    private int fgsMadeTier1; // 0-49 yards
    private int fgsMadeTier2; // 50+ yards

    public Player() {
        self.fantasyScore = 0;
        self.passingYards = 0;
        self.passingTds = 0;
        self.passingInts = 0;
        self.rushingYards = 0;
        self.rushingTds = 0;
        self.receptions = 0;
        self.recievingYards = 0;
        self.recievingTds = 0;
        self.twoPointConversions = 0;
        self.fumblesLost = 0;
        self.fumbleRecoveryTds = 0;
        self.teamSacks = 0;
        self.teamInterceptions = 0;
        self.teamFumbleRecoveries = 0;
        self.safeties = 0;
        self.teamDefensiveTds = 0;
        self.kickReturnTds; // also punt rec = 0;
        self.pointsAllowed = 0;
        self.soloTackles = 0;
        self.assistedTackles = 0;
        self.sacks = 0;
        self.sackYards = 0;
        self.tacklesForLoss = 0;
        self.QBhits = 0;
        self.passesDefended = 0;
        self.fumblesForced = 0;
        self.fumbleRecoveries = 0;
        self.defensiveTds = 0;
        self.twoPointConversionReturns = 0;
        self.patsMade = 0;
        self.fgsMadeTier1 = 0; // 0-49 yards
        self.fgsMadeTier2 = 0; // 50+ yards
    }

    public


}
