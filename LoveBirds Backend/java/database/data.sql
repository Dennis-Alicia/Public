BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

--additional users
INSERT INTO users (username,password_hash,role) VALUES ('birb','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('borb','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('tweeter33','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Skyhigh25','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Nested34','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Seedless1','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Ibite95','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('crazycr0w','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Sassyseahawk','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('JoshP3ck','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Prettybird7','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Prettyflyforaskyguy','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Morningriser42','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Sandrunnerz','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Morningmourner','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Hawkeye','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('SweetyTweety53','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Griffindoor','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('KisstheKiwi','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Azuredragoon','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Zabumafoo','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('Chirpiee','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('totallyabird','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');

--profile table
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('James','Robert','45','Oregon','False','Car Mechanic during the day, Pop Star at night.','Sunflower seeds','https://academy.allaboutbirds.org/wp-content/uploads/IndigoBunting_Birdshare7298027936_MichaelaSagatova.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Big','Bird','104','Sesame Street','False','LoveBirds Administrator','Birdseed Milkshakes','https://imgix.ranker.com/user_node_img/50138/1002750839/original/1002750839-photo-u1737202204?auto=format&q=60&fit=crop&fm=pjpg&dpr=2&w=375');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Duck','Norris','83','California','False','American martial artist and actor. Black belt. Air force veteran.','Hamburger Sandwich','https://familyfarmlivestock.com/wp-content/uploads/2021/01/20201127_151224.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Hillary','Puff','35','California','True','American actress and singer. Nickelodeon Star','Diet Coca Cola','https://mymodernmet.com/wp/wp-content/uploads/2020/05/long-tailed-tit-japan-4.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Daffy','Dee','21','California','True','My ex says I am crazy, but I prefer to be called looney.,','Garlic Bread','https://petkeen.com/wp-content/uploads/2022/05/white-crested-duck-swimming_Lilly-P.-Green-Shutterstock-760x479.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Donald','Yensid','32','Florida','False','Daisies are my favorite flower. I enjoy taking my three nephews to theme parks!','Pancakes','https://www.hexham-courant.co.uk/resources/images/12036221/?type=responsive-gallery-fullscreen');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Thalia','Byrd','89','Virginia','True','89 Years Young and looking for someone to nest with.','Macaroni and Cheese','https://travisaudubon.org/home/wp-content/uploads/2011/07/Wren-Bewicks.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Johnny','Seed','77','Pennsylvania','False','#FarmLife. Talk to me if you love growing apples as much as I do. I swear, there is nothing better in this world than a home grown, home picked, home cooked apple pie.','Bananas','https://petkeen.com/wp-content/uploads/2022/01/a-royal-purple-guinea-fowl_imagevixen_Shutterstock-760x630.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Raven','James','44','Virginia','True','I write poetry and only wear black.','Blueberries','https://upload.wikimedia.org/wikipedia/commons/3/33/Brewers_Blackbird_Esquimalt_Lagoon.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Amber','Crow','55','New Jersey','True','Kleptomaniac or eclectic collector. You decide.','French Fries','https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Corvus-brachyrhynchos-001.jpg/1200px-Corvus-brachyrhynchos-001.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Hensel','Grace','47','Rhode Island','False','Born and raised close to the water, but I cannot swim. Bird Bowling Champion 2002.','Nachos. Only the ones at the bowling alley.','https://ankiweb.net/shared/mpreview/940243165/6.jpg?1607026419');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Josh','Peck','36','New York','False','Do not talk to me about that show. Listen to my podcast. Here for promo only.','Glass bottled water at 11.2pH.','https://news.mit.edu/sites/default/files/styles/news_article__image_gallery/public/images/201602/Pileated-Woodpecker-MITx_0.jpeg?itok=yfnqOBOr');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Cardi','Nal','25','North Carolina','True','Down South Gal with Up North taste. I have two pet humans, Sprinkles and Sparkles.','Gold dusted birdseed','https://inaturalist-open-data.s3.amazonaws.com/photos/248246349/large.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Bill','Ente','27','Kentucky','False','A simple southern bird. I can fix your car AND your heart.','Mashed Potatoes','https://www.allaboutbirds.org/guide/assets/photo/296839171-480px.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Icarus','Sone','101','Florida','False','Inventor. Living in the sunshine state, but not much of a fan of the sun.','Sun Chips','https://9b16f79ca967fd0708d1-2713572fef44aa49ec323e813b06d2d9.ssl.cf2.rackcdn.com/1140x_a10-7_cTC/20161123HOBaliMynah-1568469380.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Sandy','Piper','19','Rhode Island','True','Beach bum. Trying to spread my wings. Who wants to come along for the flight?','Mackerel','https://res.cloudinary.com/sagacity/image/upload/c_crop/c_limit,dpr_2.625,f_auto,fl_lossy,q_80,w_380/Snowy_Plover_SRQ_magazine_we7efa.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Kay','Efcee','23','Kentucky','True','Vegan. Environmentalist. Minimalist','Cashews','https://cdn.mos.cms.futurecdn.net/BX7vjSt8KMtcBHyisvcSPK.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Chester','Chirper','51','Utah','False','Fishing is my one true love. Seriously, ask my 5 ex-wives. Seeking the 6th catch of my life.','Shrimp','https://www.allaboutbirds.org/guide/assets/photo/60320571-480px.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Birdie','Jones','85','Texas','True','I loved extreme sports when I was young. Nowadays, I chase the thrill of a good round of bingo.','Raisins','https://www.indystar.com/gcdn/presto/2020/05/19/PIND/56300c38-847e-4776-9ed6-3d0e2b204926-AP070117047053.jpg?crop=918,689,x0,y707');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Parker','Griffin','22','Arizona','False','New to the area. I am a bit of a family guy and am looking to start one of my own.','Doritos','https://live-production.wcms.abc-cdn.net.au/7b43d18680b83637f1a5135adcdf4eb8?impolicy=wcms_crop_resize&cropH=1289&cropW=2294&xPos=0&yPos=114&width=862&height=485');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Tasha','Sead','45','Delaware','True','Dela-WHERE are you from? I am a stand up comedian, can you not tell?','Microwave Burritos','https://i.pinimg.com/736x/f5/fc/58/f5fc5836bf73074499643d2a49974ced.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Jay','Bleu','18','New Jersey','False','Jersey Shore is my inspiration. I would love to be on a reboot. In the meantime, I work at Pelicans Snow Balls.','Bagels','https://a-z-animals.com/media/blue-jay-1.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Halsin','Woodland','35','Colorado','False','I love nature. Bears are my favorite.','Honey','https://upload.wikimedia.org/wikipedia/commons/d/d6/Prodotiscus_zambesiae%2C_Cuito-rivier%2C_Birding_Weto%2C_a.jpg');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Woody','Woods','75','Maine','False','Carpenter and homemaker. Come make a home with me.','Jelly','https://s7d1.scene7.com/is/image/isp/wabredbelliedwoodpecker-dwb?qlt=100&wid=1200&ts=1688408148695&$ImageComponent$&fit=constrain');
INSERT INTO profiles (first_name, last_name, age, location, sex, biography, favorite_food, profile_image)
VALUES ('Tom','Kat','20','Florida','False','I may look like a cat, but I am totally a bird. Looking for a bird lover for my bird self.','Meow Mix','https://petcube.com/blog/content/images/2021/03/IMG_1751--1-.png');

--likes table
INSERT INTO likes (profile_id, liked_profile_id)
VALUES ('3','4');
INSERT INTO likes (profile_id, liked_profile_id)
VALUES ('4','3');

--conversations table
INSERT INTO conversations (profile_id, receiver_id)
VALUES ('3','4');
INSERT INTO conversations (profile_id, receiver_id)
VALUES ('4','3');

--messages table
INSERT INTO messages (conversation_id, message_content)
VALUES ('1','HOWDY');
INSERT INTO messages (conversation_id, message_content)
VALUES ('2','MEOWDY');


COMMIT TRANSACTION;
