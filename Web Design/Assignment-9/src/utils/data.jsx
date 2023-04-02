import Testimonial1 from "../pics/testimonial1.jpg";
import Testimonial2 from "../pics/testimonial2.jpg";
import Testimonial3 from '../pics/testimonial3.jpg';
import Testimonial4 from '../pics/testimonial4.jpg';
import drink1 from "../pics/drink1.jpg";
import drink2 from "../pics/drink2.jpg";
import drink3 from '../pics/drink3.jpg';
import drink4 from '../pics/drink4.jpg';
import Location1 from '../pics/Loc1.jpg';
import Location2 from '../pics/Loc3.jpg'
import Location3 from '../pics/Loc1.jpg'



const data = {
    AboutUsData: [
        {
            img :Testimonial1,
            title:"Sophia Lauren",
            description:
            "5 Star:  Limon is the perfect drink for those who love a refreshing burst of citrus flavor. It's not too sweet or too sour, and the bubbles add a nice touch. I could easily drink this all day, every day."
        },
        {
            img :Testimonial2,
            title:"Nick Ackerman",
            description:
            "4.5 Star: I tried Limon for the first time and it quickly became my go-to summer drink. It's so light and refreshing, and the lemon flavor is just right. I also appreciate that it's not too sugary or heavy. Definitely a must-try!"
    
        },
        {
            img :Testimonial3,
            title:"Laura Maine",
            description:
            "4.9 Star: I'm not usually a fan of lemon drinks, but Limon changed my mind. It's not overpowering, and the fizz makes it fun to drink. I also appreciate that it's not loaded with sugar, which is a bonus for me. I highly recommend giving this drink a try!"
            },
        {
            img :Testimonial4,
            title:"Ginger Beck",
            description:
            "5 Star: Mango Yuzu is my new favorite drink. It's a great alternative to soda and it's so much more refreshing. The lemon flavor is just right - not too strong, not too weak. I also love that it's not too sweet. I'll definitely be stocking up on this for the summer!"
        }
    
    ],
    JobData: [
        {
            img :Location1,
            title:"Cambridge: Head Chef",
            description:
            "Quincy Market, Faneuil Hall Marketplace, 206 S Market St, Boston, MA 02109"
        },
        {
            img :Location2,
            title:"Seaport : Bartender",
            description:
            "Seaport Market, Faneuil Hall Marketplace, Boston, MA 02109, United States"
        },
        {
            img :Location3,
            title:"Cambridge : Bouncer",
            description:
            "Cambridge Market, Cambridge Marketplace, Boston, MA 02130, Boston"
        }
    
    ],
    
    info: {
        name: 'Maniruzzaman Akash',
        short_description: 'Hi, I\'m Maniruzzaman Akash.',
        image_url: 'https://akash.devsenv.com/api/public/images/profile/profile.png',
        description: "<h3>I'm a full stack web developer experiencing more than 4+ years with <br><code>PHP</code>, <code>Laravel</code>, <code>JavaScript</code>, <code>Vue Js</code>, <code>React Js</code>, <code>React Native</code> <br>and many more..</h3>",
        phone_no: '+8801951233084',
        email: 'manirujjamanakash@gmail.com',
    },

    social: {
        facebook: 'https://www.facebook.com/maniruzzaman.akash',
        twitter: 'https://twitter.com/ManiruzzamanAk',
        github: 'https://github.com/ManiruzzamanAkash',
        linkedin: 'https://www.linkedin.com/in/maniruzzamanakash',
    },

    portfolioCategories: [
        'Web Design',
        'Web Development',
        'App Development',
    ],


     CardData: [
    {
        img :drink1,
        title:"Limon",
        description:
        "Limon is a refreshing and zesty drink that is perfect for hot summer days. It is made with fresh lemon juice, sparkling water, and a touch of sugar to balance out the tartness. The result is a light and tangy beverage that is sure to quench your thirst and awaken your taste buds. Limon can be enjoyed on its own or as a mixer for cocktails."
    },
    {
        img :drink2,
        title:"Mango Yuzu",
        description:
        "Mango Yuzu is a refreshing and tropical cocktail made with fresh mango juice, yuzu syrup, and vodka. Yuzu, a Japanese citrus fruit, adds a tangy and citrusy flavor to the sweet and juicy mango. This cocktail is perfect for sipping on a hot summer day, and its vibrant yellow color is sure to brighten up any gathering."
    },
    {
        img :drink3,
        title:"Hawaian Punch",
        description:
        "Hawaiian Punch is a sweet and fruity drink that is perfect for a hot summer day. It is made with a blend of fruit juices, including pineapple, passionfruit, and guava, which give it a tropical flavor. The drink is typically served over ice and garnished with a slice of fruit for an extra refreshing touch."
    },
    {
        img :drink4,
        title:"White Russian",
        description:
        "White Russian is a classic cocktail made with vodka, coffee liqueur, and cream, served over ice. Its origin is somewhat disputed, but it became popular in the United States in the 1960s. The drink's creamy sweetness complements the bitterness of the coffee liqueur and the heat of the vodka, resulting in a deliciously smooth and satisfying drink."
    }

],
    portfolios: [
        {
            id: 1,
            category: 'Web Development',
            title: "DeshiBazaarBD - A Multi vendor Ecommerce market place",
            image: 'https://akash.devsenv.com/api/public/images/portfolios/deshibazaarbd/desi-homepage.png'
        },
        {
            id: 2,
            category: 'Web Development',
            title: "DMWords - A Big Dictionary Project",
            image: 'https://akash.devsenv.com/api/public/images/portfolios/dmwords/dmwords-home.png'
        },
        {
            id: 3,
            category: 'Web Design',
            title: "Pipe Line Admin Panel Design",
            image: 'https://i.ibb.co/DfGqqtp/01-Home-Page-Dashboard.png'
        },
        {
            id: 4,
            category: 'App Development',
            title: "iApp - Intelligent Business App",
            image: 'https://i.ibb.co/WgMTCYH/playstore-demo.png'
        },
        {
            id: 5,
            category: 'Website Development',
            title: "Akij City - A POS Solution",
            image: 'https://akash.devsenv.com/api/public/images/portfolios/akij-city/akij-city-logo.png'
        },
        {
            id: 6,
            category: 'Website Development',
            title: "PSTU - A University Website",
            image: 'https://akash.devsenv.com/api/public/images/portfolios/pstu/pstu.png'
        },
    ]
}

export default data;