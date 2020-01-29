package di.constructor03;

public class MysqlArticleDAO implements IArticleDAO{
	
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("MySQL > " + article.getTitle() + " " + article.getContent());
	}

}
