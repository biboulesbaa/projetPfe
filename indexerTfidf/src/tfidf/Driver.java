package tfidf;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FileUtil;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.util.ProgramDriver;

import utilities.filesMGR;
import utilities.fusionFile;
import utilities.terms;

/**
 * A driver class to initiate the appropriate job based on the user's input.
 * 
 * @author hero
 */
public class Driver {

	/**
	 * @param args
	 */
	
	public static boolean ligne = true ; 
	public static void main(String[] args) {
        
		int exitCode = -1;
		ProgramDriver pgd = new ProgramDriver();
        
		try {
			// Add all the join main classes
			pgd.addClass("tf-idf-1", WordFrequenceInDoc.class,
					"TF-IDF 1 --- Word Frequence In Documents");
			pgd.addClass("tf-idf-2", WordCountsForDocs.class,
					"TF-IDF 2 --- Word Counts In Documents");
			pgd.addClass("tf-idf-3", WordsInCorpusTFIDF.class,
					"TF-IDF 3 --- Word in Corpus and TF-IDF");
			
			//pgd.addClass("tf-idf-4", MatrixTfidf.class,
				//	"TF-IDF 4 --- Matrix TF-IDF");

			// Execute the appropriate class
			pgd.driver(args);
			
			/*String srcPath = "/user/hadoopuser/input"; 
			String dstPath = "/user/hadoopuser/output/fusion"; 
			Configuration conf = new Configuration(); 
			try { 
				FileSystem hdfs = FileSystem.get(conf); 
			    FileUtil.copyMerge(hdfs, new Path(srcPath), hdfs, new Path(dstPath), false, conf, null); 
			    } catch (IOException e){ 
			    	
			}*/
		
   
			//fusionFile.fusion("user/hadoopuser/input/sample.txt", "user/hadoopuser/Terms/terms.txt" );
			// Success
			exitCode = 0;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.exit(exitCode);
	}

}
