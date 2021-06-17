![GitHub top language](https://img.shields.io/github/languages/top/CarlosRobertoMedeiros/revision-stream-java)
### Java 8 / 11 - Revision (Stream - Optional)


## Owner

	- Carlos Roberto Medeiros de Lima

### Tips and Tricks ###
	
	#What´s SAM (Single Abstract Method)
	
		- Reference Link for Lambda (pt-br language) https://rinaldo.dev/java-8-streams-pare-de-usar-for-e-simplifique-seu-codigo/
		
		- Lambda
		- Stream 
			. Intermediate operations (Operações Intermediárias)
				- Skip
				- Limit
				- Distinct
				- Filter
				- Map
			. Final Operations (Operações Finais)
				- Count
				- Min and Max
				- Collect toList
				- Collect groupingBy
				- Collect joining(Only Strings)
				- Loop Explicit vs Implicit
				- Others ways to create Streams
				
				
		- Optional (Obs.::: In Java 8 don't use Optional like function parameter only with function return )
			- isPresent   -- verify if exists value inside the Optional
			- get  		  -- return the value of Optional, but it's doesn´t work with exceptions
			
			- ifPresent   -- return an expression Lambda
			- orElse
			- orElseGet
			- orElseThrow
			
			- Primitive Types
				- OptionalInt -- using the OptionalInt class with the commom parse method for cast
				- OptionalDouble
				- OptionalLong

		- Stream
			- Reduce
				- Associative Function **(ordered with or without parentesis) (1+1) + (1+2) + (1+3) the same that (1+1+1+2+1+3)
					Sum 		
					Multiply   
					Concat
				- Unassociative Function **Cannot Use
					Subtraction **(the result is diferent with or without parentesis) (1-1) - (1-2) - (1-3) the same that (1-1-1-2-1-3). use Stream.parallel().reduce
				
						
					
				