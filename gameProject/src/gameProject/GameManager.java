package gameProject;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		 System.out.println("Yeni oyun eklendi");
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi");
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi");
		
	}

}
