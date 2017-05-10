
package twitter;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;


public class TwitterDriver extends Configured implements Tool {


	@Override
	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Configuration conf = new Configuration();
		
		Job job = new Job(conf, "[Twitter Data Analyaser]");
		
		job.setJarByClass(TwitterDriver.class);
		job.setMapperClass(TwitterMapper.class);
		job.setReducerClass(TwitterReducer.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(LongWritable.class);
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		
		MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class);
		MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class);
		MultipleInputs.addInputPath(job, new Path(args[2]), TextInputFormat.class);
		MultipleInputs.addInputPath(job, new Path(args[3]), TextInputFormat.class);

	    FileOutputFormat.setOutputPath(job, new Path(args[4]));
		
		return job.waitForCompletion(true) ? 0 : 1;
		
	}

	public static void main(String[] args) {

		try 
		{
		   TwitterDriver driver = new TwitterDriver();	
           int successCode = ToolRunner.run(driver, args);
		   System.exit(successCode); 	
           
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Exception while running the Hadoop Job :" + e);

			e.printStackTrace();
		}

	}

}
