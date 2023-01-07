package service;
import model.Rewards;



public interface RewardsService {
    public Rewards getRewardsByCustomerId(Long customerId);
}