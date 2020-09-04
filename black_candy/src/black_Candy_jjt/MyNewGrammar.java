/* Generated By:JJTree&JavaCC: Do not edit this line. MyNewGrammar.java */
package black_Candy_jjt;

public class MyNewGrammar/*@bgen(jjtree)*/implements MyNewGrammarTreeConstants, MyNewGrammarConstants {/*@bgen(jjtree)*/
  protected static JJTMyNewGrammarState jjtree = new JJTMyNewGrammarState();
  public static void main(String args []) throws ParseException
  {System.out.println("BLACK Candy programming language  \ud83d\udda4");//Welcome to our language for users
    System.out.print("Enter:"); //Here the user will enter the sentence to follow the rules of the BLACK Candy language
    new MyNewGrammar(System.in);
     try
    {
      SimpleNode n= MyNewGrammar.start();
      n.dump(">>");
      MyNewGrammar.start();
      System.out.println("ACCEPTED \u005cn Thank you \ud83d\udc8b. :)");  //it will print it to user if her/him follow the rules correctly
    }
    catch (Exception e)
    {
      System.out.println("Oops.\u005cn NOT ACCEPTED :( ");  //it will print it to user if her/him do some thing wrong
      System.out.println(e.getMessage());
    }
  }

//                                     **** BNF ****


// ----------------------------------------                               
  static final public SimpleNode start() throws ParseException {
                       /*@bgen(jjtree) start */
                       SimpleNode jjtn000 = new SimpleNode(JJTSTART);
                       boolean jjtc000 = true;
                       jjtree.openNodeScope(jjtn000);Token t;
    try {
      STMT();
      t = jj_consume_token(DOT);
                    jjtn000.jjtSetValue(t.image);
   jjtree.closeNodeScope(jjtn000, true);
   jjtc000 = false;
   {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
   if (jjtc000) {
     jjtree.clearNodeScope(jjtn000);
     jjtc000 = false;
   } else {
     jjtree.popNode();
   }
   if (jjte000 instanceof RuntimeException) {
     {if (true) throw (RuntimeException)jjte000;}
   }
   if (jjte000 instanceof ParseException) {
     {if (true) throw (ParseException)jjte000;}
   }
   {if (true) throw (Error)jjte000;}
    } finally {
   if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
    throw new Error("Missing return statement in function");
  }

// ----------------------------------------
  static final public void STMT() throws ParseException {
              /*@bgen(jjtree) STMT */
              SimpleNode jjtn000 = new SimpleNode(JJTSTMT);
              boolean jjtc000 = true;
              jjtree.openNodeScope(jjtn000);Token t;
    try {
      if (jj_2_1(2)) {
        ASSIGMNET();
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case AT:
          ARRAY();
          break;
        case DOTS:
          CONDITION();
          break;
        case DOUBLE:
        case INT:
          Numbers();
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case PLUS:
          case MINUS:
          case MULTIPLY:
          case DIVIDE:
            ARTHIMETIC();
            break;
          case OR:
          case AND:
            LogicalOperator();
            break;
          case GRATER_THAN:
          case LESS_THAN:
            Comparisons();
            break;
          case EQUALS:
          case NOT_EQUALS:
            RelationalOperator();
            break;
          default:
            jj_la1[0] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
     if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
     }
    }
  }

// ----------------------------------------
  static final public void ASSIGMNET() throws ParseException {
                    /*@bgen(jjtree) ASSIGMNET */
                    SimpleNode jjtn000 = new SimpleNode(JJTASSIGMNET);
                    boolean jjtc000 = true;
                    jjtree.openNodeScope(jjtn000);Token t1,t2;
    try {
      t1 = jj_consume_token(AT);
      DATA_TYPE();
      IDEN();
      t2 = jj_consume_token(ASSIGN);
      VAR();
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
   jjtn000.jjtSetValue(t1.image+", "+t2.image);
    } catch (Throwable jjte000) {
   if (jjtc000) {
     jjtree.clearNodeScope(jjtn000);
     jjtc000 = false;
   } else {
     jjtree.popNode();
   }
   if (jjte000 instanceof RuntimeException) {
     {if (true) throw (RuntimeException)jjte000;}
   }
   if (jjte000 instanceof ParseException) {
     {if (true) throw (ParseException)jjte000;}
   }
   {if (true) throw (Error)jjte000;}
    } finally {
   if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
  }

// ----------------------------------------
  static final public void IDEN() throws ParseException {
               /*@bgen(jjtree) IDEN */
                SimpleNode jjtn000 = new SimpleNode(JJTIDEN);
                boolean jjtc000 = true;
                jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(ID);
             jjtree.closeNodeScope(jjtn000, true);
             jjtc000 = false;
            jjtn000.jjtSetValue(t.image);
    } finally {
   if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
  }

// ----------------------------------------
  static final public void VAR() throws ParseException {
             /*@bgen(jjtree) VAR */
             SimpleNode jjtn000 = new SimpleNode(JJTVAR);
             boolean jjtc000 = true;
             jjtree.openNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DOUBLE:
      case INT:
        Numbers();
        break;
      case WORD:
        t = jj_consume_token(WORD);
                             jjtree.closeNodeScope(jjtn000, true);
                             jjtc000 = false;
                            jjtn000.jjtSetValue(t.image);
        break;
      case STRING:
        t = jj_consume_token(STRING);
                                                                          jjtree.closeNodeScope(jjtn000, true);
                                                                          jjtc000 = false;
                                                                         jjtn000.jjtSetValue(t.image);
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
   if (jjtc000) {
     jjtree.clearNodeScope(jjtn000);
     jjtc000 = false;
   } else {
     jjtree.popNode();
   }
   if (jjte000 instanceof RuntimeException) {
     {if (true) throw (RuntimeException)jjte000;}
   }
   if (jjte000 instanceof ParseException) {
     {if (true) throw (ParseException)jjte000;}
   }
   {if (true) throw (Error)jjte000;}
    } finally {
   if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
  }

// ----------------------------------------
  static final public void INDEXend() throws ParseException {
                  /*@bgen(jjtree) INDEXend */
                  SimpleNode jjtn000 = new SimpleNode(JJTINDEXEND);
                  boolean jjtc000 = true;
                  jjtree.openNodeScope(jjtn000);Token t1, t2;
    try {
      t1 = jj_consume_token(DOT);
      t2 = jj_consume_token(EX);
                        jjtree.closeNodeScope(jjtn000, true);
                        jjtc000 = false;
                       jjtn000.jjtSetValue(t1.image+", "+t2.image);
    } finally {
   if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
  }

// ----------------------------------------
  static final public void ArrrayElements() throws ParseException {
                        /*@bgen(jjtree) ArrrayElements */
                        SimpleNode jjtn000 = new SimpleNode(JJTARRRAYELEMENTS);
                        boolean jjtc000 = true;
                        jjtree.openNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WORD:
        t = jj_consume_token(WORD);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
             jjtn000.jjtSetValue(t.image);
        break;
      case INT:
        t = jj_consume_token(INT);
                                                        jjtree.closeNodeScope(jjtn000, true);
                                                        jjtc000 = false;
                                                       jjtn000.jjtSetValue(t.image);
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
   if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
  }

// ----------------------------------------
  static final public void ARRAY() throws ParseException {
               /*@bgen(jjtree) ARRAY */
               SimpleNode jjtn000 = new SimpleNode(JJTARRAY);
               boolean jjtc000 = true;
               jjtree.openNodeScope(jjtn000);Token t1,t2,t3,t4, t5;
    try {
      t1 = jj_consume_token(AT);
      t2 = jj_consume_token(ARRAY);
      IDEN();
      t3 = jj_consume_token(ASSIGN);
      t4 = jj_consume_token(VER);
      label_1:
      while (true) {
        ArrrayElements();
        INDEXend();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
        case WORD:
          ;
          break;
        default:
          jj_la1[4] = jj_gen;
          break label_1;
        }
      }
      t5 = jj_consume_token(VER);
     jjtree.closeNodeScope(jjtn000, true);
     jjtc000 = false;
    jjtn000.jjtSetValue(t1.image+", "+t2.image+ " , "+t3.image+", "+t4.image+", "+t5.image);
    } catch (Throwable jjte000) {
     if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
     }
    }
  }

// ----------------------------------------
  static final public void DATA_TYPE() throws ParseException {
                   /*@bgen(jjtree) DATA_TYPE */
                    SimpleNode jjtn000 = new SimpleNode(JJTDATA_TYPE);
                    boolean jjtc000 = true;
                    jjtree.openNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case num:
        t = jj_consume_token(num);
                jjtree.closeNodeScope(jjtn000, true);
                jjtc000 = false;
               jjtn000.jjtSetValue(t.image);
        break;
      case NUM:
        t = jj_consume_token(NUM);
               jjtree.closeNodeScope(jjtn000, true);
               jjtc000 = false;
              jjtn000.jjtSetValue(t.image);
        break;
      case SEN:
        t = jj_consume_token(SEN);
               jjtree.closeNodeScope(jjtn000, true);
               jjtc000 = false;
              jjtn000.jjtSetValue(t.image);
        break;
      case CON:
        t = jj_consume_token(CON);
               jjtree.closeNodeScope(jjtn000, true);
               jjtc000 = false;
              jjtn000.jjtSetValue(t.image);
        break;
      case word:
        t = jj_consume_token(word);
                jjtree.closeNodeScope(jjtn000, true);
                jjtc000 = false;
               jjtn000.jjtSetValue(t.image);
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
  if (jjtc000) {
    jjtree.closeNodeScope(jjtn000, true);
  }
    }
  }

// ----------------------------------------
  static final public void Numbers() throws ParseException {
                 /*@bgen(jjtree) Numbers */
                  SimpleNode jjtn000 = new SimpleNode(JJTNUMBERS);
                  boolean jjtc000 = true;
                  jjtree.openNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
        t = jj_consume_token(INT);
                   jjtree.closeNodeScope(jjtn000, true);
                   jjtc000 = false;
                  jjtn000.jjtSetValue(t.image);
        break;
      case DOUBLE:
        t = jj_consume_token(DOUBLE);
                                                                    jjtree.closeNodeScope(jjtn000, true);
                                                                    jjtc000 = false;
                                                                   jjtn000.jjtSetValue(t.image);
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

// ----------------------------------------
  static final public void ARTHIMETIC() throws ParseException {
                     /*@bgen(jjtree) ARTHIMETIC */
                     SimpleNode jjtn000 = new SimpleNode(JJTARTHIMETIC);
                     boolean jjtc000 = true;
                     jjtree.openNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        t = jj_consume_token(PLUS);
                    jjtn000.jjtSetValue(t.image);
        break;
      case MINUS:
        t = jj_consume_token(MINUS);
                                                                  jjtn000.jjtSetValue(t.image);
        break;
      case MULTIPLY:
        t = jj_consume_token(MULTIPLY);
                                                                                                                   jjtn000.jjtSetValue(t.image);
        break;
      case DIVIDE:
        t = jj_consume_token(DIVIDE);
                                                                                                                                                                  jjtn000.jjtSetValue(t.image);
        break;
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Numbers();
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

// ----------------------------------------
  static final public void Comparisons() throws ParseException {
                     /*@bgen(jjtree) Comparisons */
                     SimpleNode jjtn000 = new SimpleNode(JJTCOMPARISONS);
                     boolean jjtc000 = true;
                     jjtree.openNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case GRATER_THAN:
        t = jj_consume_token(GRATER_THAN);
                      jjtn000.jjtSetValue(t.image);
        break;
      case LESS_THAN:
        t = jj_consume_token(LESS_THAN);
                                                                         jjtn000.jjtSetValue(t.image);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Numbers();
    } catch (Throwable jjte000) {
   if (jjtc000) {
     jjtree.clearNodeScope(jjtn000);
     jjtc000 = false;
   } else {
     jjtree.popNode();
   }
   if (jjte000 instanceof RuntimeException) {
     {if (true) throw (RuntimeException)jjte000;}
   }
   if (jjte000 instanceof ParseException) {
     {if (true) throw (ParseException)jjte000;}
   }
   {if (true) throw (Error)jjte000;}
    } finally {
   if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
  }

// ----------------------------------------
  static final public void LogicalOperator() throws ParseException {
                         /*@bgen(jjtree) LogicalOperator */
                          SimpleNode jjtn000 = new SimpleNode(JJTLOGICALOPERATOR);
                          boolean jjtc000 = true;
                          jjtree.openNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OR:
        t = jj_consume_token(OR);
             jjtn000.jjtSetValue(t.image);
        break;
      case AND:
        t = jj_consume_token(AND);
                                                         jjtn000.jjtSetValue(t.image);
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Numbers();
    } catch (Throwable jjte000) {
   if (jjtc000) {
     jjtree.clearNodeScope(jjtn000);
     jjtc000 = false;
   } else {
     jjtree.popNode();
   }
   if (jjte000 instanceof RuntimeException) {
     {if (true) throw (RuntimeException)jjte000;}
   }
   if (jjte000 instanceof ParseException) {
     {if (true) throw (ParseException)jjte000;}
   }
   {if (true) throw (Error)jjte000;}
    } finally {
   if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
  }

// ----------------------------------------
  static final public void RelationalOperator() throws ParseException {
                            /*@bgen(jjtree) RelationalOperator */
                             SimpleNode jjtn000 = new SimpleNode(JJTRELATIONALOPERATOR);
                             boolean jjtc000 = true;
                             jjtree.openNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EQUALS:
        t = jj_consume_token(EQUALS);
                  jjtn000.jjtSetValue(t.image);
        break;
      case NOT_EQUALS:
        t = jj_consume_token(NOT_EQUALS);
                                                                     jjtn000.jjtSetValue(t.image);
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Numbers();
    } catch (Throwable jjte000) {
   if (jjtc000) {
     jjtree.clearNodeScope(jjtn000);
     jjtc000 = false;
   } else {
     jjtree.popNode();
   }
   if (jjte000 instanceof RuntimeException) {
     {if (true) throw (RuntimeException)jjte000;}
   }
   if (jjte000 instanceof ParseException) {
     {if (true) throw (ParseException)jjte000;}
   }
   {if (true) throw (Error)jjte000;}
    } finally {
   if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
    }
  }

// ----------------------------------------
  static final public void CONDITION() throws ParseException {
                   /*@bgen(jjtree) CONDITION */
                    SimpleNode jjtn000 = new SimpleNode(JJTCONDITION);
                    boolean jjtc000 = true;
                    jjtree.openNodeScope(jjtn000);Token t1,t2,t3,t4;
    try {
      t1 = jj_consume_token(DOTS);
      t2 = jj_consume_token(DOTS);
      Numbers();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case GRATER_THAN:
      case LESS_THAN:
        Comparisons();
        break;
      case OR:
      case AND:
        LogicalOperator();
        break;
      case EQUALS:
      case NOT_EQUALS:
        RelationalOperator();
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      t3 = jj_consume_token(DOTS);
      t4 = jj_consume_token(DOTS);
      CON();
     jjtree.closeNodeScope(jjtn000, true);
     jjtc000 = false;
    jjtn000.jjtSetValue(t1.image+", "+t2.image+ " , "+t3.image+", "+t4.image);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

// ----------------------------------------
  static final public void CON() throws ParseException {
             /*@bgen(jjtree) CON */
             SimpleNode jjtn000 = new SimpleNode(JJTCON);
             boolean jjtc000 = true;
             jjtree.openNodeScope(jjtn000);Token t1,t2,t3;
    try {
      if (jj_2_2(2)) {
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case DOTS:
            ;
            break;
          default:
            jj_la1[12] = jj_gen;
            break label_2;
          }
          t1 = jj_consume_token(DOTS);
                 jjtn000.jjtSetValue(t1.image);
        }
        Numbers();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case GRATER_THAN:
        case LESS_THAN:
          Comparisons();
          break;
        case OR:
        case AND:
          LogicalOperator();
          break;
        case EQUALS:
        case NOT_EQUALS:
          RelationalOperator();
          break;
        default:
          jj_la1[13] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        t2 = jj_consume_token(DOTS);
        t3 = jj_consume_token(DOTS);
                                                                                                  jjtn000.jjtSetValue(t2.image+ " , "+t3.image);
        STMT();
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case DOTS:
        case AT:
        case DOUBLE:
        case INT:
          STMT();
          break;
        default:
          jj_la1[14] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_3R_25() {
    if (jj_scan_token(NOT_EQUALS)) return true;
    return false;
  }

  static private boolean jj_3R_24() {
    if (jj_scan_token(EQUALS)) return true;
    return false;
  }

  static private boolean jj_3R_14() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_24()) {
    jj_scanpos = xsp;
    if (jj_3R_25()) return true;
    }
    return false;
  }

  static private boolean jj_3R_3() {
    if (jj_scan_token(AT)) return true;
    if (jj_3R_9()) return true;
    return false;
  }

  static private boolean jj_3R_22() {
    if (jj_scan_token(OR)) return true;
    return false;
  }

  static private boolean jj_3R_13() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_22()) {
    jj_scanpos = xsp;
    if (jj_3R_23()) return true;
    }
    return false;
  }

  static private boolean jj_3R_21() {
    if (jj_scan_token(LESS_THAN)) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_3R_3()) return true;
    return false;
  }

  static private boolean jj_3R_23() {
    if (jj_scan_token(AND)) return true;
    return false;
  }

  static private boolean jj_3R_6() {
    if (jj_3R_12()) return true;
    return false;
  }

  static private boolean jj_3R_20() {
    if (jj_scan_token(GRATER_THAN)) return true;
    return false;
  }

  static private boolean jj_3R_12() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_20()) {
    jj_scanpos = xsp;
    if (jj_3R_21()) return true;
    }
    return false;
  }

  static private boolean jj_3R_10() {
    if (jj_scan_token(INT)) return true;
    return false;
  }

  static private boolean jj_3R_8() {
    if (jj_3R_14()) return true;
    return false;
  }

  static private boolean jj_3R_11() {
    if (jj_scan_token(DOUBLE)) return true;
    return false;
  }

  static private boolean jj_3R_5() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_10()) {
    jj_scanpos = xsp;
    if (jj_3R_11()) return true;
    }
    return false;
  }

  static private boolean jj_3R_4() {
    if (jj_scan_token(DOTS)) return true;
    return false;
  }

  static private boolean jj_3_2() {
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_4()) { jj_scanpos = xsp; break; }
    }
    if (jj_3R_5()) return true;
    xsp = jj_scanpos;
    if (jj_3R_6()) {
    jj_scanpos = xsp;
    if (jj_3R_7()) {
    jj_scanpos = xsp;
    if (jj_3R_8()) return true;
    }
    }
    return false;
  }

  static private boolean jj_3R_19() {
    if (jj_scan_token(word)) return true;
    return false;
  }

  static private boolean jj_3R_18() {
    if (jj_scan_token(CON)) return true;
    return false;
  }

  static private boolean jj_3R_17() {
    if (jj_scan_token(SEN)) return true;
    return false;
  }

  static private boolean jj_3R_15() {
    if (jj_scan_token(num)) return true;
    return false;
  }

  static private boolean jj_3R_16() {
    if (jj_scan_token(NUM)) return true;
    return false;
  }

  static private boolean jj_3R_9() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_15()) {
    jj_scanpos = xsp;
    if (jj_3R_16()) {
    jj_scanpos = xsp;
    if (jj_3R_17()) {
    jj_scanpos = xsp;
    if (jj_3R_18()) {
    jj_scanpos = xsp;
    if (jj_3R_19()) return true;
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_7() {
    if (jj_3R_13()) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public MyNewGrammarTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[15];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xffc0,0x68800000,0x60000000,0x40000000,0x40000000,0x0,0x60000000,0x3c0,0x3000,0xc000,0xc00,0xfc00,0x800000,0xfc00,0x68800000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x180,0x80,0x80,0x67,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[2];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public MyNewGrammar(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public MyNewGrammar(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new MyNewGrammarTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public MyNewGrammar(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new MyNewGrammarTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public MyNewGrammar(MyNewGrammarTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(MyNewGrammarTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[41];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 15; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 41; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 2; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
