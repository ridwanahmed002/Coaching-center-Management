package interfaces;

import classes.Branch;

public interface BranchOperation {
	public void insertBranch(Branch branch);

	public void removeBranch(Branch branch);

	public Branch getBranch(int id);

	public void showAllBranchs();
}
