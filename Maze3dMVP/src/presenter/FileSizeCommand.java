package presenter;

import model.Model;
import view.View;

public class FileSizeCommand implements Command {

	private Model m;
	private View v;

	public FileSizeCommand(View v, Model m) {
		this.m = m;
		this.v = v;
	}

	@Override
	public void doCommand(String[] args) {
		if (args.length == 1) {
			v.displayMessage(m.MazeFileSize(args[0]));
		} else {
			v.displayMessage("file_size [(String) filename]");
		}
	}
}
