package org.chw.proto;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public class DomTokenList
{
	private List<CommonToken> tokenList=new ArrayList<CommonToken>();

	
	public CommonToken getToken(int offset)
	{
		if(tokenList==null || tokenList.isEmpty())
		{
			return (CommonToken)Token.EOF_TOKEN;
		}
		else if(offset<0)
		{
			return tokenList.get(0);
		}
		else if(offset>=getLength())
		{
			return (CommonToken)Token.EOF_TOKEN;
		}
		else
		{
			for(CommonToken token : tokenList)
			{
				if(token.getStartIndex()<=offset && offset<=token.getStopIndex())
				{
					return token;
				}
			}

			return (CommonToken)Token.EOF_TOKEN;
		}
	}
	
	public CommonToken getNextToken(CommonToken token)
	{
		if(tokenList==null || tokenList.size()==0)
		{
			return null;
		}
		else
		{
			int index=tokenList.indexOf(token);
			if(index==tokenList.size()-1)
			{
				if(token.getType()==Token.EOF)
				{
					return null;
				}
				else
				{
					return (CommonToken)Token.EOF_TOKEN;
				}
			}
			else
			{
				return tokenList.get(index+1);
			}
		}
	}
	
	public int getLength()
	{
		if(tokenList==null || tokenList.isEmpty())
		{
			return 0;
		}
		else
		{
			return tokenList.get(tokenList.size()-1).getStopIndex()+1;
		}
	}
	
	public List<CommonToken> getTokenList()
	{
		return this.tokenList;
	}
	
	public void setTokenList(List<CommonToken> tokenList)
	{
		if(tokenList.size()==0)
		{
			this.tokenList=null;
		}
		this.tokenList=tokenList;
	}
	
}
