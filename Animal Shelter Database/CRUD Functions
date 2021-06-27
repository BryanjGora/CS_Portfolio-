from pymongo import MongoClient
class AnimalShelter(object):
    """ CRUD operations for Animal collection in MongoDB """

    def __init__(self, username=None, password=None):
 
        if username and password:
            self.client = MongoClient('mongodb://%s:%s@localhost:44880' % (username, password))
        else:
            self.client = MongoClient('mongodb://localhost:44880')
        self.database = self.client['project']

# Complete this create method to implement the C in CRUD.
    def create(self, data):
        if data is not None:
            insert = self.database.animals.insert(data)  # data should be dictionary 
            if insert!=0:
                return True
            else:
                return False           
        else:
            raise Exception("Nothing to save, because data parameter is empty")


    # Create method to implement the R in CRUD.
    def read(self,criteria=None):

        # criteria is not None then this find will return all rows which matches the criteria
        if criteria:
         # {'_id':False} just omits the unique ID of each row        
            
            data = self.database.animals.find(criteria,{"_id":False})
        else:
        #if there is no search criteria then all the rows will be return  
            data = self.database.animals.find( {} , {"_id":False})

        return data
# Create method to implement U in CRUD

def update(self, project):
        if project is not None:

            self.database.projects.save(project.get_as_json())            
        else:
            raise Exception("Nothing to update, because project parameter is None")
# Create method to implement D in CRUD
 def delete(self, project):
        if project is not None:
            self.database.projects.remove(project.get_as_json())            
        else:
            raise Exception("Nothing to delete, because project parameter is None")
