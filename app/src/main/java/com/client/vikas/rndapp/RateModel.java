package com.client.vikas.rndapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RateModel {

    @SerializedName("Apr")
    @Expose
    private Double apr;
    @SerializedName("AssetUrl")
    @Expose
    private String assetUrl;
    @SerializedName("Availability")
    @Expose
    private String availability;
    @SerializedName("BaseRateDifferential")
    @Expose
    private Double baseRateDifferential;
    @SerializedName("BookingFee")
    @Expose
    private Integer bookingFee;
    @SerializedName("CashBackAmount")
    @Expose
    private Double cashBackAmount;
    @SerializedName("Changed")
    @Expose
    private String changed;
    @SerializedName("Eligibility")
    @Expose
    private String eligibility;
    @SerializedName("ErcPercentage")
    @Expose
    private Integer ercPercentage;
    @SerializedName("ErcSchedule")
    @Expose
    private String ercSchedule;
    @SerializedName("FeesPayable")
    @Expose
    private Integer feesPayable;
    @SerializedName("HasFreeLegals")
    @Expose
    private Boolean hasFreeLegals;
    @SerializedName("HasFreeValuations")
    @Expose
    private Boolean hasFreeValuations;
    @SerializedName("InitialRate")
    @Expose
    private Double initialRate;
    @SerializedName("IsBorrowingInRetirement")
    @Expose
    private Boolean isBorrowingInRetirement;
    @SerializedName("IsFamilyDeposit")
    @Expose
    private Boolean isFamilyDeposit;
    @SerializedName("IsGreen")
    @Expose
    private Boolean isGreen;
    @SerializedName("IsHelpToBuy")
    @Expose
    private Boolean isHelpToBuy;
    @SerializedName("IsIntermediaryProduct")
    @Expose
    private Boolean isIntermediaryProduct;
    @SerializedName("IsSaveToBuy")
    @Expose
    private Boolean isSaveToBuy;
    @SerializedName("IsSpecialOffer")
    @Expose
    private Boolean isSpecialOffer;
    @SerializedName("IsSuppressed")
    @Expose
    private Boolean isSuppressed;
    @SerializedName("MaxLoanAmount")
    @Expose
    private Double maxLoanAmount;
    @SerializedName("MaxLoanToValue")
    @Expose
    private Double maxLoanToValue;
    @SerializedName("MinLoanAmount")
    @Expose
    private Double minLoanAmount;
    @SerializedName("MinLoanToValue")
    @Expose
    private Double minLoanToValue;
    @SerializedName("MonthlyRepayment")
    @Expose
    private Double monthlyRepayment;
    @SerializedName("MortgageType")
    @Expose
    private Integer mortgageType;
    @SerializedName("OverpaymentAmountAllowed")
    @Expose
    private Integer overpaymentAmountAllowed;
    @SerializedName("ProductDescription")
    @Expose
    private String productDescription;
    @SerializedName("ProductFamilyCode")
    @Expose
    private String productFamilyCode;
    @SerializedName("ProductFee")
    @Expose
    private Integer productFee;
    @SerializedName("ProductGrouping")
    @Expose
    private String productGrouping;
    @SerializedName("ProductIllustrationPayment")
    @Expose
    private Integer productIllustrationPayment;
    @SerializedName("RepresentativeFinalPayment")
    @Expose
    private Double representativeFinalPayment;
    @SerializedName("RepresentativeLoanAmount")
    @Expose
    private Double representativeLoanAmount;
    @SerializedName("RepresentativeMonthlyPayment1")
    @Expose
    private Double representativeMonthlyPayment1;
    @SerializedName("RepresentativeMonthlyPayment2")
    @Expose
    private Double representativeMonthlyPayment2;
    @SerializedName("RepresentativeMonthlyPayment3")
    @Expose
    private Double representativeMonthlyPayment3;
    @SerializedName("RepresentativeMonthlyPayment4")
    @Expose
    private Double representativeMonthlyPayment4;
    @SerializedName("RepresentativeMonthlyPayment5")
    @Expose
    private Double representativeMonthlyPayment5;
    @SerializedName("RepresentativeTerm")
    @Expose
    private Integer representativeTerm;
    @SerializedName("RepresentativeTotalAmountPayable")
    @Expose
    private Double representativeTotalAmountPayable;
    @SerializedName("RepresentativeTotalInterestPayable")
    @Expose
    private Double representativeTotalInterestPayable;
    @SerializedName("RequiresExistingBorrower")
    @Expose
    private Boolean requiresExistingBorrower;
    @SerializedName("RequiresFirstTimeBuyer")
    @Expose
    private Boolean requiresFirstTimeBuyer;
    @SerializedName("RequiresFlexAccount")
    @Expose
    private Boolean requiresFlexAccount;
    @SerializedName("RequiresFurtherAdvance")
    @Expose
    private Boolean requiresFurtherAdvance;
    @SerializedName("RequiresHomeMover")
    @Expose
    private Boolean requiresHomeMover;
    @SerializedName("RequiresOwnSolicitor")
    @Expose
    private Boolean requiresOwnSolicitor;
    @SerializedName("RequiresRemortgage")
    @Expose
    private Boolean requiresRemortgage;
    @SerializedName("RequiresSwitchAndFix")
    @Expose
    private Boolean requiresSwitchAndFix;
    @SerializedName("RequiresSwitcher")
    @Expose
    private Boolean requiresSwitcher;
    @SerializedName("RequiresSwitcherConsumer")
    @Expose
    private Boolean requiresSwitcherConsumer;
    @SerializedName("ReservationFeeScale")
    @Expose
    private String reservationFeeScale;
    @SerializedName("RevertRate1")
    @Expose
    private Double revertRate1;
    @SerializedName("SpecialProductFee")
    @Expose
    private Double specialProductFee;
    @SerializedName("Term")
    @Expose
    private Integer term;
    @SerializedName("ValuationFeeAmount")
    @Expose
    private Double valuationFeeAmount;
    @SerializedName("Withdrawn")
    @Expose
    private Boolean withdrawn;

    public Double getApr() {
        return apr;
    }

    public void setApr(Double apr) {
        this.apr = apr;
    }

    public String getAssetUrl() {
        return assetUrl;
    }

    public void setAssetUrl(String assetUrl) {
        this.assetUrl = assetUrl;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Double getBaseRateDifferential() {
        return baseRateDifferential;
    }

    public void setBaseRateDifferential(Double baseRateDifferential) {
        this.baseRateDifferential = baseRateDifferential;
    }

    public Integer getBookingFee() {
        return bookingFee;
    }

    public void setBookingFee(Integer bookingFee) {
        this.bookingFee = bookingFee;
    }

    public Double getCashBackAmount() {
        return cashBackAmount;
    }

    public void setCashBackAmount(Double cashBackAmount) {
        this.cashBackAmount = cashBackAmount;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public Integer getErcPercentage() {
        return ercPercentage;
    }

    public void setErcPercentage(Integer ercPercentage) {
        this.ercPercentage = ercPercentage;
    }

    public String getErcSchedule() {
        return ercSchedule;
    }

    public void setErcSchedule(String ercSchedule) {
        this.ercSchedule = ercSchedule;
    }

    public Integer getFeesPayable() {
        return feesPayable;
    }

    public void setFeesPayable(Integer feesPayable) {
        this.feesPayable = feesPayable;
    }

    public Boolean getHasFreeLegals() {
        return hasFreeLegals;
    }

    public void setHasFreeLegals(Boolean hasFreeLegals) {
        this.hasFreeLegals = hasFreeLegals;
    }

    public Boolean getHasFreeValuations() {
        return hasFreeValuations;
    }

    public void setHasFreeValuations(Boolean hasFreeValuations) {
        this.hasFreeValuations = hasFreeValuations;
    }

    public Double getInitialRate() {
        return initialRate;
    }

    public void setInitialRate(Double initialRate) {
        this.initialRate = initialRate;
    }

    public Boolean getIsBorrowingInRetirement() {
        return isBorrowingInRetirement;
    }

    public void setIsBorrowingInRetirement(Boolean isBorrowingInRetirement) {
        this.isBorrowingInRetirement = isBorrowingInRetirement;
    }

    public Boolean getIsFamilyDeposit() {
        return isFamilyDeposit;
    }

    public void setIsFamilyDeposit(Boolean isFamilyDeposit) {
        this.isFamilyDeposit = isFamilyDeposit;
    }

    public Boolean getIsGreen() {
        return isGreen;
    }

    public void setIsGreen(Boolean isGreen) {
        this.isGreen = isGreen;
    }

    public Boolean getIsHelpToBuy() {
        return isHelpToBuy;
    }

    public void setIsHelpToBuy(Boolean isHelpToBuy) {
        this.isHelpToBuy = isHelpToBuy;
    }

    public Boolean getIsIntermediaryProduct() {
        return isIntermediaryProduct;
    }

    public void setIsIntermediaryProduct(Boolean isIntermediaryProduct) {
        this.isIntermediaryProduct = isIntermediaryProduct;
    }

    public Boolean getIsSaveToBuy() {
        return isSaveToBuy;
    }

    public void setIsSaveToBuy(Boolean isSaveToBuy) {
        this.isSaveToBuy = isSaveToBuy;
    }

    public Boolean getIsSpecialOffer() {
        return isSpecialOffer;
    }

    public void setIsSpecialOffer(Boolean isSpecialOffer) {
        this.isSpecialOffer = isSpecialOffer;
    }

    public Boolean getIsSuppressed() {
        return isSuppressed;
    }

    public void setIsSuppressed(Boolean isSuppressed) {
        this.isSuppressed = isSuppressed;
    }

    public Double getMaxLoanAmount() {
        return maxLoanAmount;
    }

    public void setMaxLoanAmount(Double maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }

    public Double getMaxLoanToValue() {
        return maxLoanToValue;
    }

    public void setMaxLoanToValue(Double maxLoanToValue) {
        this.maxLoanToValue = maxLoanToValue;
    }

    public Double getMinLoanAmount() {
        return minLoanAmount;
    }

    public void setMinLoanAmount(Double minLoanAmount) {
        this.minLoanAmount = minLoanAmount;
    }

    public Double getMinLoanToValue() {
        return minLoanToValue;
    }

    public void setMinLoanToValue(Double minLoanToValue) {
        this.minLoanToValue = minLoanToValue;
    }

    public Double getMonthlyRepayment() {
        return monthlyRepayment;
    }

    public void setMonthlyRepayment(Double monthlyRepayment) {
        this.monthlyRepayment = monthlyRepayment;
    }

    public Integer getMortgageType() {
        return mortgageType;
    }

    public void setMortgageType(Integer mortgageType) {
        this.mortgageType = mortgageType;
    }

    public Integer getOverpaymentAmountAllowed() {
        return overpaymentAmountAllowed;
    }

    public void setOverpaymentAmountAllowed(Integer overpaymentAmountAllowed) {
        this.overpaymentAmountAllowed = overpaymentAmountAllowed;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductFamilyCode() {
        return productFamilyCode;
    }

    public void setProductFamilyCode(String productFamilyCode) {
        this.productFamilyCode = productFamilyCode;
    }

    public Integer getProductFee() {
        return productFee;
    }

    public void setProductFee(Integer productFee) {
        this.productFee = productFee;
    }

    public String getProductGrouping() {
        return productGrouping;
    }

    public void setProductGrouping(String productGrouping) {
        this.productGrouping = productGrouping;
    }

    public Integer getProductIllustrationPayment() {
        return productIllustrationPayment;
    }

    public void setProductIllustrationPayment(Integer productIllustrationPayment) {
        this.productIllustrationPayment = productIllustrationPayment;
    }

    public Double getRepresentativeFinalPayment() {
        return representativeFinalPayment;
    }

    public void setRepresentativeFinalPayment(Double representativeFinalPayment) {
        this.representativeFinalPayment = representativeFinalPayment;
    }

    public Double getRepresentativeLoanAmount() {
        return representativeLoanAmount;
    }

    public void setRepresentativeLoanAmount(Double representativeLoanAmount) {
        this.representativeLoanAmount = representativeLoanAmount;
    }

    public Double getRepresentativeMonthlyPayment1() {
        return representativeMonthlyPayment1;
    }

    public void setRepresentativeMonthlyPayment1(Double representativeMonthlyPayment1) {
        this.representativeMonthlyPayment1 = representativeMonthlyPayment1;
    }

    public Double getRepresentativeMonthlyPayment2() {
        return representativeMonthlyPayment2;
    }

    public void setRepresentativeMonthlyPayment2(Double representativeMonthlyPayment2) {
        this.representativeMonthlyPayment2 = representativeMonthlyPayment2;
    }

    public Double getRepresentativeMonthlyPayment3() {
        return representativeMonthlyPayment3;
    }

    public void setRepresentativeMonthlyPayment3(Double representativeMonthlyPayment3) {
        this.representativeMonthlyPayment3 = representativeMonthlyPayment3;
    }

    public Double getRepresentativeMonthlyPayment4() {
        return representativeMonthlyPayment4;
    }

    public void setRepresentativeMonthlyPayment4(Double representativeMonthlyPayment4) {
        this.representativeMonthlyPayment4 = representativeMonthlyPayment4;
    }

    public Double getRepresentativeMonthlyPayment5() {
        return representativeMonthlyPayment5;
    }

    public void setRepresentativeMonthlyPayment5(Double representativeMonthlyPayment5) {
        this.representativeMonthlyPayment5 = representativeMonthlyPayment5;
    }

    public Integer getRepresentativeTerm() {
        return representativeTerm;
    }

    public void setRepresentativeTerm(Integer representativeTerm) {
        this.representativeTerm = representativeTerm;
    }

    public Double getRepresentativeTotalAmountPayable() {
        return representativeTotalAmountPayable;
    }

    public void setRepresentativeTotalAmountPayable(Double representativeTotalAmountPayable) {
        this.representativeTotalAmountPayable = representativeTotalAmountPayable;
    }

    public Double getRepresentativeTotalInterestPayable() {
        return representativeTotalInterestPayable;
    }

    public void setRepresentativeTotalInterestPayable(Double representativeTotalInterestPayable) {
        this.representativeTotalInterestPayable = representativeTotalInterestPayable;
    }

    public Boolean getRequiresExistingBorrower() {
        return requiresExistingBorrower;
    }

    public void setRequiresExistingBorrower(Boolean requiresExistingBorrower) {
        this.requiresExistingBorrower = requiresExistingBorrower;
    }

    public Boolean getRequiresFirstTimeBuyer() {
        return requiresFirstTimeBuyer;
    }

    public void setRequiresFirstTimeBuyer(Boolean requiresFirstTimeBuyer) {
        this.requiresFirstTimeBuyer = requiresFirstTimeBuyer;
    }

    public Boolean getRequiresFlexAccount() {
        return requiresFlexAccount;
    }

    public void setRequiresFlexAccount(Boolean requiresFlexAccount) {
        this.requiresFlexAccount = requiresFlexAccount;
    }

    public Boolean getRequiresFurtherAdvance() {
        return requiresFurtherAdvance;
    }

    public void setRequiresFurtherAdvance(Boolean requiresFurtherAdvance) {
        this.requiresFurtherAdvance = requiresFurtherAdvance;
    }

    public Boolean getRequiresHomeMover() {
        return requiresHomeMover;
    }

    public void setRequiresHomeMover(Boolean requiresHomeMover) {
        this.requiresHomeMover = requiresHomeMover;
    }

    public Boolean getRequiresOwnSolicitor() {
        return requiresOwnSolicitor;
    }

    public void setRequiresOwnSolicitor(Boolean requiresOwnSolicitor) {
        this.requiresOwnSolicitor = requiresOwnSolicitor;
    }

    public Boolean getRequiresRemortgage() {
        return requiresRemortgage;
    }

    public void setRequiresRemortgage(Boolean requiresRemortgage) {
        this.requiresRemortgage = requiresRemortgage;
    }

    public Boolean getRequiresSwitchAndFix() {
        return requiresSwitchAndFix;
    }

    public void setRequiresSwitchAndFix(Boolean requiresSwitchAndFix) {
        this.requiresSwitchAndFix = requiresSwitchAndFix;
    }

    public Boolean getRequiresSwitcher() {
        return requiresSwitcher;
    }

    public void setRequiresSwitcher(Boolean requiresSwitcher) {
        this.requiresSwitcher = requiresSwitcher;
    }

    public Boolean getRequiresSwitcherConsumer() {
        return requiresSwitcherConsumer;
    }

    public void setRequiresSwitcherConsumer(Boolean requiresSwitcherConsumer) {
        this.requiresSwitcherConsumer = requiresSwitcherConsumer;
    }

    public String getReservationFeeScale() {
        return reservationFeeScale;
    }

    public void setReservationFeeScale(String reservationFeeScale) {
        this.reservationFeeScale = reservationFeeScale;
    }

    public Double getRevertRate1() {
        return revertRate1;
    }

    public void setRevertRate1(Double revertRate1) {
        this.revertRate1 = revertRate1;
    }

    public Double getSpecialProductFee() {
        return specialProductFee;
    }

    public void setSpecialProductFee(Double specialProductFee) {
        this.specialProductFee = specialProductFee;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Double getValuationFeeAmount() {
        return valuationFeeAmount;
    }

    public void setValuationFeeAmount(Double valuationFeeAmount) {
        this.valuationFeeAmount = valuationFeeAmount;
    }

    public Boolean getWithdrawn() {
        return withdrawn;
    }

    public void setWithdrawn(Boolean withdrawn) {
        this.withdrawn = withdrawn;
    }

}
