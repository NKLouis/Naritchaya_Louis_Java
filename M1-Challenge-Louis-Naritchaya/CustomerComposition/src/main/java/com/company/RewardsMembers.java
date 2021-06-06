package com.company;

public class RewardsMembers {

    boolean isRewardsMember = true;
    boolean isNotRewardMember = false;

    public RewardsMembers(boolean isRewardsMember, boolean isNotRewardMember) {
        this.isRewardsMember = isRewardsMember;
        this.isNotRewardMember = isNotRewardMember;
    }

    public RewardsMembers() {

    }

    public boolean isRewardsMember() {
        return isRewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        isRewardsMember = rewardsMember;
    }

    public boolean isNotRewardMember() {
        return isNotRewardMember;
    }

    public void setNotRewardMember(boolean notRewardMember) {
        isNotRewardMember = notRewardMember;
    }

    @Override
    public String toString() {
        return "RewardsMembers{" +
                "isRewardsMember=" + isRewardsMember +
                ", isNotRewardMember=" + isNotRewardMember +
                '}';
    }
}